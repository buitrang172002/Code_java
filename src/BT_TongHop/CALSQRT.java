package BT_TongHop;

import java.util.Scanner;

public class CALSQRT {

	public static int canbac2(int a) {
		return (int) Math.sqrt(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=1;i<=n;i++) {
			int a= scan.nextInt();
			
			
			System.out.println("#"+i+" "+ canbac2(a));
		}
	}

}
