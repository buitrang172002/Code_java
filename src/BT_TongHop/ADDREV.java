package BT_TongHop;

import java.util.Scanner;

public class ADDREV {
	public static int soDao(int n) {
		int x, y = 0;
		while (n!=0) {
			x = n%10;
			y = y*10 + x;
			n = n/10;
		}
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=0;t<T;t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int tong = soDao(n) + soDao(m);
			
			System.out.println(soDao(tong));
		}
	}

}
