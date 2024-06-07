package BT_TongHop;

import java.util.Scanner;

public class PROB01 {
	
	public static int sumNumbers(int n) {
		int sum = 0;
		while (n!=0) {
			int x = n%10;
			n = n/10;
			sum+=x;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			int n =scan.nextInt();
			
			int x = sumNumbers(n);
			while (x>=10) {
				int k = x;
				x = sumNumbers(k);
			}
			System.out.println("#"+t+" "+ x);
		}
	}

}
