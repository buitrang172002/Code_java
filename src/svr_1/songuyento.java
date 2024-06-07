package svr_1;

import java.util.Scanner;

public class songuyento {

	public static boolean ktra(int n) {
		if (n < 2)	return false;
		if (n==2 || n==3)	return true;
		if (n%2 ==0 || n%3 ==0)		return false;
		  for (int i = 5; i * i <= n; i += 6) {
		        if (n % i == 0 || n % (i + 2) == 0) {
		            return false;
		        }
		    }
		    return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();  // Số lượng đoạn m và l

	        String a[] = new String[100] ;
	        for (int i = 0; i < t; i++) {
	            int m = scan.nextInt();
	            int n = scan.nextInt();
	            
	            for (int j = m; j <= n; j++) {
	                if (ktra(j)) {
	                   System.out.println(j);
	                }
	                
	            }
	            System.out.print("\n");
	        }
	        scan.close();
	    }
	}