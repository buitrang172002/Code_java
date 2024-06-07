package String;

import java.util.Scanner;

public class TIMKIEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for (int t=1;t<=10;t++) {
			int n = scan.nextInt();
			scan.nextLine();
			String s1 = scan.nextLine();
			String s2 = scan.nextLine();
			int count =0;
//			for (int i=0;i<=s2.length()-s1.length();i++) {
//				String copy = s2.substring(i, i+s1.length());
//				if (copy.equals(s1)) {
//					count++;
//				}
//			}
			
			for (int i = 0; i <= s2.length() - s1.length(); i++) {
	            boolean found = true;
	            for (int j = 0; j < s1.length(); j++) {
	                if (s1.charAt(j) != s2.charAt(i + j)) {
	                    found = false;
	                    break;
	                }
	            }
	            if (found) {
	                count++;
	            }
	        }
			System.out.print("#"+n+" "+count );
		}
		
		
	}

}
