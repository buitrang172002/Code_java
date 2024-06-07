package BLT_APS1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LOGOSYM {

	public static int dxHang(int a[][], int n) {
		int kt =1;
		for (int i=0;i<n/2;i++) {
			for (int j=0;j<n;j++) {
				if (a[i][j]==a[n-i-1][j])	kt =1;
				else kt =0;
				if (kt==0)	break;
			}
			if (kt==0)	break;
		}
		return kt;
	}
	public static int dxCot(int a[][], int n) {
		int kt =1;
		for (int j=0;j<n/2;j++) {
			for (int i=0;i<n;i++) {
				if (a[i][j]==a[i][n-j-1])	kt =1;
				else kt =0;
				if (kt==0)	break;
			}
			if (kt==0)	break;
		}
		return kt;
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			int n = scan.nextInt();
			int array[][] = new int[n][n];
			for (int i=0;i<n;i++) {
				for (int j=0;j<n;j++)
				array[i][j] = scan.nextInt();
			}
			
			if (dxHang(array,n)==1 && dxCot(array,n)==1) {
				System.out.println("#"+t+" "+"YES");
			}else {
				System.out.println("#"+t+" "+"NO");
			}
		}
		scan.close();
	}

}
