package BT_TongHop;

import java.util.Scanner;

public class SUMPROE {
	public static final int dic = 1000007;
	public static int Sum(int n) {
		long sum =0;
		for (int i=1;i<=n;i++) {
			int x = n/i;
			sum+= (x*i);
		}
		sum = sum%dic;
		return (int)	sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=0;t<T;t++) {
			int n = scan.nextInt();
			
			System.out.println(Sum(n));
			
		}
	}

}
