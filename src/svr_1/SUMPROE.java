package svr_1;

import java.util.Scanner;

public class SUMPROE {

	 static final int MOD = 1000007;

	    public static int sumOfProducts(int N) {
	        long result = 0; 
	        int  y;
	        for (int x=1;x<=N;x++) {
	        	y = (int) N/x; 
	        	result = result + (x*y);
	        }
	        result %= MOD;
	        return (int) result; 
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int T = scanner.nextInt();
	        
	        for (int t = 0; t < T; t++) {
	            int N = scanner.nextInt();
	            System.out.println(sumOfProducts(N));
	        }

	        scanner.close();
	    }
	}