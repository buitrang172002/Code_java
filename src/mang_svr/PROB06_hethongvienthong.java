package mang_svr;
import java.util.*;
public class PROB06_hethongvienthong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			
			int M = scan.nextInt();
			int N = scan.nextInt();
			
			char arr[][] = new char[M][N];
			int des[][] = new int[M][N];
			scan.nextLine();
			for (int i=0;i<M;i++) {
				String line = scan.nextLine();
				for (int j=0;j<N;j++) {
					arr[i][j] = line.charAt(j);
					if (arr[i][j]=='H') {
						des[i][j] = 1;
					}
				}
			}
		
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
					switch (arr[i][j]) {
						case 'A':
							
							if (i>0 && arr[i-1][j]=='H') {
								des[i-1][j] = 0;
							}
							if (i<M-1 && arr[i+1][j]=='H') {
								des[i+1][j] = 0;
							}
							if (j<N-1 && arr[i][j+1]=='H') {
								des[i][j+1] = 0;
							}
							if (j>0 && arr[i][j-1]=='H'){
								des[i][j-1] = 0;
							}
								 			
							break;
						case 'B':
							
							int dem =0;
							int k=1;
							while (dem<2) {
								if (i - k>=0 && arr[i-k][j]=='H') {
									des[i-k][j] = 0;
								}
								if (i+k<M && arr[i+k][j]=='H') {
									des[i+k][j] = 0;
								}
								if (j+k<N && arr[i][j+k]=='H') {
									des[i][j+k] = 0;
								}
								if (j-k>=0 && arr[i][j-k]=='H'){
									des[i][j-k] = 0;
								}
								k++;
								dem++;
							}
							
							break;
						case 'C':
							
							int cout =0;
							int x=1;
							while (cout<3 ) {
								if (i-x>=0 && arr[i-x][j]=='H') {
									des[i-x][j] = 0;
								}
								if (i+x<M && arr[i+x][j]=='H') {
									des[i+x][j] = 0;
								}
								if (j+x<N && arr[i][j+x]=='H') {
									des[i][j+x] = 0;
								}
								if (j-x>=0 && arr[i][j-x]=='H'){
									des[i][j-x] = 0;
								}
								x++;
								cout++;
							}
							break;
					}
				}
			
			}
			int dem=0;
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
					if (des[i][j]==1) {
						dem++;
					}
				}
			}
			System.out.println("#"+ t +" " + dem);
		}
		  scan.close();
	}

}
