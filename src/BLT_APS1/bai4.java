package BLT_APS1;

import java.util.Scanner;

public class bai4 {
	static int n,m,x,y;
	public static boolean ktraSoDep(int x, int a[]) {
		int dem=0;
		while (x!=0) {
			int k = x%10;
			for (int j=0;j<n;j++) {
				if (k==a[j]) {
					dem++;
				}
				
			}
			x = x/10;
		}
		
		if (dem>=m)return true;
		else return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			n = scan.nextInt();
			m = scan.nextInt();
			int a[] = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]= scan.nextInt();
				
			}
			x = scan.nextInt();
			y = scan.nextInt();
			
			//tinh
			int count =0;
			
			for (int i = x;i<=y;i++) {
				if (ktraSoDep(i,a))	count++;
			}
			
			System.out.println("#"+t+" "+count);
		}
		scan.close();
	}

}
