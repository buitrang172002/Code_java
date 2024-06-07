package BLT_APS1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bai6 {
	public static int T,N,M;
	
	public static int xl_1[] = {0,-1,0,-2};
	public static int yl_1[] = {1,0,2,0};
	public static int xl_2[] = {1,0,2,0};
	public static int yl_2[] = {0,-1,0,-2};
	
	public static boolean ischeck(int x, int y) {
		if (x>=0 && x<M && y>=0 && y<N)	return true;
		else return false;
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			M = scan.nextInt();
			N = scan.nextInt();
			int array[][] = new int[M][N];
			int check[] = new int[4];
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
					array[i][j] = scan.nextInt();
				}
			}
			int countT =0;
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
					if (array[i][j]==1) {
						int countL =0, countL2=0;
						for (int k=0;k<4;k++) {
							int newxk = xl_1[k]+i;
							int newyk = yl_1[k]+j;
							if (ischeck(newxk,newyk)) {
								if (array[newxk][newyk]==1)	countL++;
							}
							int newxk2 = xl_2[k]+i;
							int newyk2 = yl_2[k]+j;
							if (ischeck(newxk2,newyk2)) {
								if (array[newxk2][newyk2]==1)	countL2++;
							}
						}
						if (countL==4) check[0]++;
						if (countL2==4) check[0]++;
					}
				}
			}
			System.out.println("#"+t+" "+ check[0]+" "+ countT);
		}
		scan.close();
	}

}
