package BT_TongHop;

import java.util.Scanner;

public class PROB02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int t=1;t<=T;t++) {					
			int m = scan.nextInt();
			int n = scan.nextInt();
			
			scan.nextLine();
			char array[][] = new char[5*m+1][5*n+1];
			
			for (int i=0;i<5*m+1;i++) {
				String line = scan.next();
				for (int j=0;j<5*n+1;j++) {
					array[i][j]= line.charAt(j);
				}
			}
			int dem[] = new int[5];
			
			for (int i=1;i<5*m+1;i+=5) {
				for (int j=1;j<5*n+1;j+=5) {
					int count = 0;
					for (int k=i;k<i+4;k++) {
						if (array[k][j] == '*')	count++;
					}
					dem[count]++;
				}
			}
			
			System.out.print("#" + t);
			for (int i=0;i<5;i++) {
				System.out.print(" "+dem[i]);
			}
			System.out.println();
		}
	}

}
