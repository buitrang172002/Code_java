package mang_svr;
import java.util.*;
public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			char array[][] = new char[9][9];
			for (int i=0;i<9;i++) {
				String line = scan.next();
				for (int j=0;j<9;j++) {
					array[i][j] = line.charAt(j);
				}
			}
			
			int kt = 0;		
			
			for (int i=0;i<9;i++) {
				for (int j=0;j<9;j++) {
					for (int k=j+1;k<9;k++) {		
						if (array[i][j]!='.' && array[i][j]==array[i][k]) {
							kt = 1;
							break;
						}
					}
					
				}
				if (kt==1)	break;
			}
				
			
			int cot = 0;
			
			for (int i = 0;i<9;i++) {
				for (int j=0;j<9;j++) {
					for (int p=j+1;p<9;p++) {			
						if (array[j][i]!='.' && array[j][i]==array[p][i]) {
							cot = 1;
							break;
						}
					}
					
				}		
				
				if (cot==1)	break;
			}
			
			int matran = 0;
			for (int x = 0;x<=9-3;x++) {
				for (int y=0;y<=9-3;y++) {
					for (int i=0;i<3;i++) {
						for (int j=0;j<3;j++) {
							for (int w=j+1;w<3;w++) {
								if (array[i][j]!='.' && array[i][j]==array[i][w]) {
									matran = 1;
									break;
								}
							}									
						}
						
					}
				}
				if (matran == 1)	break;
			}
			int kq = 1;
			if (kt==1 || cot==1 || matran==1)	kq =0;	
			
			System.out.println("#"+t+" "+kq);
		}
	scan.close();
	}

}
