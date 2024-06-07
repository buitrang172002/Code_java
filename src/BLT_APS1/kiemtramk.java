package BLT_APS1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class kiemtramk {
	public static int number[][] = 	{{1,2,3},
									{4,5,6},
									{7,8,9},
									{11,0,11}};
	public static int vtx[]= {-1, 1, 0, 0};
	public static int vty[]= {0, 0, 1, -1};
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			int n = scan.nextInt();
			int pass[] = new int[n];
			for (int i=0;i<n;i++) {
				pass[i] = scan.nextInt();
			}
			int userpass[] = new int[n];
			for (int i=0;i<n;i++) {
				userpass[i] = scan.nextInt();
			}
			int kt = 0;int vt=0;
			for (int i=0;i<n;i++) {
				if (pass[i]!=userpass[i])	kt++;
				
			}
			int kq=0;
			if (kt > 1)	kq =-1;
			if (kt == 1) {
				kq =-1;
				for (int i=0;i<n;i++) {
					if (pass[i]!=userpass[i]) {
						vt = i;
						break;
					}
				}
			
					for (int i=0;i<4;i++) {
						for (int j=0;j<3;j++) {
							if (pass[vt]==number[i][j]) {
								
								for (int k=0;k<4;k++) {
									int newx = i+vtx[k];
									int newy = j+vty[k];
									
									if (newx>=0 && newx<n && newy>=0 && newy<n) {
										if (number[newx][newy]==userpass[vt]) {
											kq = vt+1;
											break;
										}
									}
								}
							}
						}
					}
				
			}
			System.out.println("#"+t+" "+kq);
		}
		scan.close();
	}

}
