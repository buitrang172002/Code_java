package mang_svr;

import java.util.Scanner;

public class LOGOSYM {
	
	public static boolean dxHang(int a[][], int n) {
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n/2;j++) {
				if (a[i][j]!=a[i][n-j-1]) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean dxCot(int a[][], int n) {
		
		for (int i=0;i<n/2;i++) {
			for (int j=0;j<n;j++) {
				if (a[i][j]!=a[n-i-1][j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			int n = scan.nextInt();
			int array[][] = new int[n][n];
			
			for (int i=0;i<n;i++) {
				for (int j=0;j<n;j++) {
					array[i][j] = scan.nextInt();
				}
			}
			
			
			if (dxHang(array,n) && dxCot(array,n)) {
				System.out.println("#"+t+" YES");
			}else {
				System.out.println("#"+t+" NO");
			}
				
		}
		scan.close();
	}

}
