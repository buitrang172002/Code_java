package String;

import java.util.Scanner;

public class chuoicondxdainhat {

	public static boolean ktraDoiXung(String str) {
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)!=str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		scan.nextLine();
		for (int t=1;t<=T;t++) {
			
			String str = scan.nextLine();
			int max = 0;
			for (int i=0;i<str.length();i++) {
				for (int j = i+1;j<=str.length();j++) {
					String copy = str.substring(i,j);
					if (ktraDoiXung(copy)) {
						if (max<copy.length()) {
							max = copy.length();
						}
					}
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}

}
