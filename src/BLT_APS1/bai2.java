package BLT_APS1;

import java.util.Scanner;

public class bai2 {

	public static int T, N;
	public static int xi[] = {1,-1,1,-1,2,2,-2,-2};
	public static int yi[] = {2,2,-2,-2,1,-1,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		
		for (int t=1;t<=T;t++) {
			N = scan.nextInt();
			int array[][] = new int[N][N];
			int x =0;
			int y =0;
			for (int i=0;i<N;i++) {
				for (int j=0;j<N;j++) {
					array[i][j] = scan.nextInt();
					if (array[i][j]==2) {
						x =i;
						y =j;
					}
				}
			}
			int count =0;
			for (int i=0;i<8;i++) {
				int newx = x+xi[i];
				int newy = y+yi[i];
				if (newx>=0 && newx<N && newy>=0 && newy<N) {
					if (array[newx][newy]==1)
						count++;
				}
			}
			System.out.println("#"+t+" "+count);
		}
		scan.close();
	}

}
