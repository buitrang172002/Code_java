package BLT_APS1;

import java.util.Scanner;

public class bai5 {
	public static int T,N;
	public static int x_1[]= {-1,0};
	public static int y_1[]= {0,1};
	public static int x_2[]= {0,1};
	public static int y_2[]= {1,0};
	public static int x_3[]= {0,1};
	public static int y_3[]= {-1,0};
	public static int x_4[]= {-1,0};
	public static int y_4[]= {0,-1};
	public static boolean ktra(int x,int y) {
		if (x>=0 && x<N && y>=0 && y<N)		return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			N = scan.nextInt();
			int array[][] = new int[N][N];
			for (int i=0;i<N;i++) {
				for (int j=0;j<N;j++) {
					array[i][j] = scan.nextInt();
				}
			}
			int count =0;
			int dem1 =0,dem2 =0, dem3 =0, dem4=0;
			for (int i=0;i<N;i++) {
				for (int j=0;j<N;j++) {
					if (array[i][j]==1) {
						dem1 =0; dem2 =0; dem3 =0; dem4 =0;
						for (int k=0;k<2;k++) {
							int newx_1 = x_1[k]+i;
							int newy_1 = y_1[k]+j;
							
							if (ktra(newx_1,newy_1) && array[newx_1][newy_1]==1) {
								dem1++;
							}
							
							int newx_2 = x_2[k]+i;
							int newy_2 = y_2[k]+j;
							
							if (ktra(newx_2,newy_2) && array[newx_2][newy_2]==1) {
								dem2++;
							}
							
							int newx_3 = x_3[k]+i;
							int newy_3 = y_3[k]+j;
							
							if (ktra(newx_3,newy_3) && array[newx_3][newy_3]==1) {
								dem3++;
							}
							
							int newx_4 = x_4[k]+i;
							int newy_4 = y_4[k]+j;
							
							if (ktra(newx_4,newy_4) && array[newx_4][newy_4]==1) {
								dem4++;
							}
							
						}
						if (dem1==2 ) count++;
						if	(dem2==2) count++;
						if	(dem3==2)	count++;
						if	(dem4==2)	count++;
					}
					
				}
			}
			System.out.println("#"+t+" "+count);
		}
		scan.close();
		
	}

}
