package svr_1;

import java.util.Scanner;

public class tinhluythua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int i=0;i<t;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.print("#" + (i+1) +" ");
			int x = (int) Math.pow(a, b);
			System.out.println(x);
		}
	}

}
