package Thi_Thu;

import java.util.Scanner;

public class MAGNETSP {
	public static int N,M,K;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			M = scan.nextInt();
			N = scan.nextInt();
			K = scan.nextInt();
			int wall[] = new int[K];
			for (int i=0;i<K;i++) {
				wall[i] = scan.nextInt();
			}
			int banco[][] = new int[M][N];
			int vtx =0,vty = 0;
			int ischeck[][] = new int[N][M];
			for (int i=0;i<M;i++) {
				for (int j=0;j<N;j++) {
					banco[i][j] = scan.nextInt();
					if (banco[i][j]==2) {
						vtx = i;
						vty = j;
					}
					
				}
			}
			int count =0;
			// kiem tra
			
					for (int k=0;k<K;k++) {
						//top
						if (wall[k] == 1) {
								for (int i=1;i<=M;i++) {
									int topx = vtx-i;
									if (topx>=0 && banco[topx][vty]!=1) {
										count++;
										banco[topx][vty] =3;
									}
									
								}
							
						}
						// bottom
						if (wall[k] == 3) {
							for (int i=1;i<=M;i++) {
								int topx = vtx+i;
								if (topx<M && banco[topx][vty]!=1) {
									count++;
									banco[topx][vty] = 3;
								}
								vtx = topx;
							}
						}
						//right
							
							if (wall[k] == 2) {
								for (int i=1;i<= N;i++) {
									int topy = vty+i;
									if (topy< N && banco[vtx][topy]!=1) {
										count++;
										banco[vtx][topy]=3;
									}
									vty = topy;
								}
							}
								//left
								
								if (wall[k] == 4) {
									for (int i=1;i<=N;i++) {
										int topy = vty-i;
										if (topy>=0 && banco[vtx][topy]!=1) {
											count++;
											banco[vtx][topy] = 3;
										}
										vty = topy;
									}
								}
					
							
				
			}
			
			System.out.println("#"+t+" "+count);
		}
		scan.close();
	}

}
