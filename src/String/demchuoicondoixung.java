package String;

import java.util.Scanner;

public class demchuoicondoixung {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();	
        scan.nextLine(); // Đọc newline character
        for (int t = 1; t <= T; t++) {	
            String str = scan.nextLine();
            int count = 0;

            for (int i = 0; i < str.length(); i++) {	
                for (int j = i + 1; j <= str.length(); j++) {
                    String copy = str.substring(i, j);
                    if (isSymmetric(copy)) {
                        count++;
                    }
                }	
            }
            
            System.out.println("#" + t + " " + count);
        }
        
        scan.close();
    }
    
    public static boolean isSymmetric(String str) {
       for (int i=0;i<str.length();i++) {
    	   if (str.charAt(i)!=str.charAt(str.length()-i-1))
    		   return false;
       }
        
        return true;
    }
}
