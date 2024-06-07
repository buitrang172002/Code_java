package mang_svr;

import java.util.Scanner;

public class duyetmangcheo {

	public static void mang(int a[][],int n) {
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
	public static void duyetmangcheo(int a[][], int n) {
		int count =0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (i==j) {
					for (int x = 0;x<i;x++) {
						
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = 5;
		int [][]array = new int[n][n];
		mang(array,n);
	}

}
