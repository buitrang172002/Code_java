package BLT_APS1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BTFNUM {
	
	public static boolean ktra(int a[], int n,int k, int m) {
		int dem =0;
		while (k!=0) {
			int x = k%10;
			for (int i=0;i<n;i++)
				if (a[i]==x)
					dem++;
			
			k = k/10;
		}
		if (dem>=m)		return true;
		return false;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("input.txt"));
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int array[] = new int[n];
			for (int i=0;i<n;i++) {
				array[i]= scan.nextInt();
			}
			int x = scan.nextInt();
			int y = scan.nextInt();
			int count=0;
			for (int i =x;i<=y;i++) {
				if (ktra(array,n,i,m))	count++;
			}
			System.out.println("#"+t+" "+count);
		}
		scan.close();
	}

}
