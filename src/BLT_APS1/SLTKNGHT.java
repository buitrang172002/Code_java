package BLT_APS1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SLTKNGHT {

	
	public static int vtx[] = {2, 1, -1, -2, -2, -1, 1, 2};
	public static int vty[] = {1, 2, 2, 1, -1, -2, -2, -1};
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setIn(new FileInputStream("input.txt"));
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			int N= scan.nextInt();
			int K = scan.nextInt();
			int M = scan.nextInt();
			int D = scan.nextInt();
			int check[][] = new int[N][N];
			int ma[][]= new int[K][2];
			for (int i=0;i<K;i++) {
				ma[i][0] = scan.nextInt();
				ma[i][1] = scan.nextInt();
				check[ma[i][0]][ma[i][1]] = 1;
			}
			int tot[][] = new int[M][2];
			for (int i=0;i<M;i++) {
				tot[i][0] = scan.nextInt();
				tot[i][1] = scan.nextInt();
				check[tot[i][0]][tot[i][1]] = 2;
			}
			
			int cocam[][] = new int[D][2];
			for (int i=0;i<D;i++) {
				cocam[i][0] = scan.nextInt();
				cocam[i][1] = scan.nextInt();
				check[cocam[i][0]][cocam[i][1]] = 3;
			}
			
			int max =0;int p =-1, q =-1;
			
			for (int i=0;i<K;i++) {
				int newx = ma[i][0];
				int newy = ma[i][1];
				int dem =0;
				for (int k=0;k<8;k++) {
					int kx = vtx[k] + newx;
					int ky = vty[k] + newy;
					if (kx>=0 && kx<N && ky>=0 && ky<N) {
						if (check[kx][ky]==2 || check[kx][ky]==1) {
							dem++;
						}
					}
				}
				if (dem>max) {
					max = dem;
					p = newx;
					q = newy;
				}
			}
			
			System.out.println("#"+t+" "+p+" "+q+" "+max);
		}
		scan.close();
	}

}
