package BLT_APS1;

import java.util.Scanner;

public class bai1 {
	
	static int N,M;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			M = scan.nextInt();
			N = scan.nextInt();
			int array[][] = new int[M][N];
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
					array[i][j] = scan.nextInt();
				}
			}
			
			int count =0;
			int max = 0;
			int x =0;int y=0;
			int ischeck[][] = new int[M][N];
			for (int i=0;i<M;i++) {
				max =0;
				for (int j = 0;j<N;j++) {
					if (array[i][j]>max) {
						max = array[i][j];
						x = i;
						y = j;
					}
					
				}
				ischeck[x][y] =1;
			}
			
			for (int j=0;j<N;j++) {
				max =0;
				for (int i=0;i<M;i++) {
					if (array[i][j]>max) {
						max = array[i][j];
						x = i;
						y = j;
					}
					
				}
				ischeck[x][y] =2;
			}
			
			for (int i=0;i<M;i++) {
				for (int j =0;j<N;j++) {
					if (ischeck[i][j]==1 || ischeck[i][j]==2) {
						max = array[i][j];
						x =i;y =j;
						for (int k = j+1;k<N;k++) {
							if (max<=array[i][k] && (ischeck[i][k]==2 || ischeck[i][k]==1)) {
								max = array[i][k];
								x = i;
								y = k;
							}
							
						}
						ischeck[x][y] = 3;
					}
					
				}
				
			}
		
			for (int j=0;j<N;j++) {
				for (int i =0;i<M;i++) {
					if (ischeck[i][j]==1 || ischeck[i][j]==3) {
						max = array[i][j];		
						x = i;
						y = j;
						for (int k = i+1;k<M;k++) {
							
							if (max<=array[k][j] && (ischeck[k][j]==3 || ischeck[k][j]==1)) {
								max = array[k][j];
								x = k;
								y = j;
							}
							
						}
					
						ischeck[x][y] = 4;
					}
					
				}
				if (ischeck[x][y] == 4) break;
			}
			
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
//					System.out.print(ischeck[i][j]+" ");
//				}
//				System.out.println();
					if (ischeck[i][j]==4)	count++;}
			}
			System.out.println("#"+t+" "+count);
		}
		scan.close();
	}

}
