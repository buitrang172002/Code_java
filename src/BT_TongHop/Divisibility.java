package BT_TongHop;

import java.util.Scanner;

public class Divisibility {

	public static void soChia(int n, int x, int y) {
		for (int i=1;i<n;i++) 
			if (i%x==0 && i%y!=0)
				System.out.println(i+" ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int t=0;t<T;t++) {
			
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			soChia(n,x,y);
		}
		scan.close();
	}

}
