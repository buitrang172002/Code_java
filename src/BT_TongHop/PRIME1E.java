package BT_TongHop;

import java.util.Scanner;

public class PRIME1E {

	public static boolean soNguyenTo(int n) {
		if (n<2)	return false;
		if (n==2 || n==3) return true;
		if (n%2==0 || n%3==0)	return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0)return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=0;t<T;t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			for (int i=n;i<=m;i++) {
				if (soNguyenTo(i)) {
					System.out.println(i);
				}
			}
			System.out.print("\n");
		}
	}

}
