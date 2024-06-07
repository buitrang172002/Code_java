package BT_TongHop;

import java.util.Scanner;

public class CALEXP {
	
	public static int luythua(int a, int b) {
		return (int) Math.pow(a, b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=1;i<=n;i++) {
			int a= scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println("#"+i+" "+ luythua(a,b));
		}
	}

}
