package mang_svr;

import java.util.Scanner;

public class BLDTWR {

	public static void sxmangtang(int a[], int n) {
		for (int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if (a[i]<a[j]) {
					int tg = a[i];
					a[i] = a[j];
					a[j] = tg;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++){
			int n = scan.nextInt();
			int m1 = scan.nextInt();
			int m2 = scan.nextInt();
			int array[] = new int[n];
			for (int i=0;i<n;i++) {
				array[i] = scan.nextInt();
			}
			sxmangtang(array,n);
			int max = m1, min = m2;
			if (m1< m2 ) {
				max = m2;
				min = m1;
			}
			int []ischeck = new int[n];
			int  sum =0;
			
			int k=1;
			int dem = 1;
			int i=0;
			while (dem<=min) {
				sum = sum + (array[i]*k);
				ischeck[i] = 1;
				k++;
				i+=2;
				dem++;
			}
			int z=1;
			for (int j=0;j<n;j++) {
				if (ischeck[j]==0) {
					sum+= (array[j]*z);
					z++;
				}
				
			}
		
			System.out.println("#"+t+" "+sum);
		}
		scan.close();
	}

}
