package BLT_APS1;

import java.util.Scanner;

public class bai3 {
	static int N,T;
	static int x[] = {1,-1,1,-1,2,2,-2,-2};
	static int y[] = {2,2,-2,-2,1,-1,1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			N  = scan.nextInt();
			
			int array[][] = new int[N][N];
			for (int i=0;i<N;i++) {
				for (int j=0;j<N;j++) {
					array[i][j] =scan.nextInt();
				}
			}
			int count =0;
			for (int i=0;i<N;i++) {
				for (int j =0;j<N;j++) {
					if (array[i][j]==2) {
						for (int k=0;k<8;k++) {
							int newx = i+x[k];
							int newy = j+y[k];
							if (newx>=0 && newx<N && newy>=0 && newy<N ) {
								if (array[newx][newy]==1)
								count++;
								array[newx][newy]=0;
							}
						}
					}
				}
			}
			System.out.println("#"+t+" "+count);
		}
				scan.close();
	}

}
