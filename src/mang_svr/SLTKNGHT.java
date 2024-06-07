package mang_svr;
import java.util.Scanner;
public class SLTKNGHT {
	 public static int x[] = {2, 1, -1, -2, -2, -1, 1, 2};
	 public static int y[] = {1, 2, 2, 1, -1, -2, -2, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int t=1;t<=T;t++) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			int M = scan.nextInt();
			int D = scan.nextInt();
			
			int ma[][] = new int[K][2];
			int vitri[][] = new int[N][N];
			for (int i=0;i<K;i++) {
				ma[i][0] = scan.nextInt();
				ma[i][1] = scan.nextInt();
				vitri[ma[i][0]][ma[i][1]] = 1;
				
			}
			
			int tot[][] = new int[M][2];
			for (int i=0;i<M;i++) {
				tot[i][0] = scan.nextInt();
				tot[i][1] = scan.nextInt();
				vitri[tot[i][0]][tot[i][1]] = 2;
				
			}
			
			int co[][] = new int[D][2];
			for (int i=0;i<D;i++) {
				co[i][0] = scan.nextInt();
				co[i][1] = scan.nextInt();
				vitri[co[i][0]][co[i][1]] = 3;
			}
			
			 int max = 0;
	            int knightX = -1;
	            int knightY = -1;

	            for (int i = 0; i < K; i++) {
	                int count = 0;
	                int kx = ma[i][0];
	                int ky = ma[i][1];

	                for (int k = 0; k < 8; k++) {
	                    int newX = kx + x[k];
	                    int newY = ky + y[k];
	                    if (newX >= 0 && newX < N && newY >= 0 && newY < N) {
	                        if (vitri[newX][newY] == 2 || vitri[newX][newY] == 1) {
	                            count++;
	                        }
	                    }
	                }
	                if (count > max) {
	                    max = count;
	                    knightX = kx;
	                    knightY = ky;
	                }
	            }

	            System.out.println("#" + t + " "+ knightX + " " + knightY + " "+ max);
	        }

	        scan.close();
	    }
	}