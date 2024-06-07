package BT_TongHop;

import java.util.Scanner;

public class NUMPER {

	public static boolean soCP(int a) {
		int x =(int) Math.sqrt(a);
		if (x*x == a)	return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i=1;i<=n;i++) {
			
			int a= scan.nextInt();
			int b = scan.nextInt();
			System.out.print("#"+i);
			int kt=0;
			for (int j=a;j<=b;j++) {
				if (soCP(j)) {
					System.out.print(" "+ j);
					kt = 1;
				}
					
			}
			System.out.println();
			if (kt == 0) {
				System.out.println("NO NUMBER");
			}
			
		}
	}

}
