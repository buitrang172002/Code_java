package svr_1;

import java.util.Scanner;

public class sonen1 {
	
	public static int tinh(int n) {
		  int sum = 0;

		    while (n > 0 || sum >= 10) {
		        if (n == 0) {
		            n = sum;
		            sum = 0;
		        }
		        sum += n % 10;
		        n /= 10;
		    }

		    return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
			
		for (int i=0;i<n;i++) {
			int m = scan.nextInt();
			System.out.print("#" + (i+1) + " ");
			System.out.print(tinh(m));
			
			System.out.println();
			
		}
		
	}

}
