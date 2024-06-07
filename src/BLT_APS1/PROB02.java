package BLT_APS1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PROB02 {
	public static int M,N,T;
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner scan = new Scanner(System.in);
		// nhap
		T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			M = scan.nextInt();
			N = scan.nextInt();
			char array[][] = new char[M*5+1][N*5+1];
			for (int i=0;i<M*5+1;i++) {
				String line = scan.next();
				for (int j=0;j<N*5+1;j++) {
					array[i][j] = line.charAt(j);
				}
			}
			
			int check[] = new int[5];
			for (int i=1;i<M*5+1;i+=5) {
				for (int j=1;j<N*5+1;j+=5) {
					int count =0;
					for (int k=i;k<i+4;k++) {
						if (array[k][j]=='*')	count++;
					}
					check[count]++;
				}
			}
			System.out.print("#"+t+" ");
			for (int i=0;i<5;i++) {
				System.out.print(check[i]+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
