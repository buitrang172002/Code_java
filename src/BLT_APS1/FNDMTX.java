package BLT_APS1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FNDMTX {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("input.txt"));
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t=1;t<=T;t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			long k = scan.nextLong();
			
			long array[][]= new long[n][n];
			for (int i=0;i<n;i++) {
				for (int j=0;j<n;j++) {
					array[i][j] = scan.nextLong();
				}
			}
			int newx =0, newy = 0;
			long closestSum = Long.MAX_VALUE;
			long max = Long.MAX_VALUE;
			for (int i=0;i<=n-m;i++) {
				for(int j=0;j<=n-m;j++) {
					long sum =0;
					for (int p = i;p<i+m;p++) {
						for (int q = j;q<j+m;q++) {
							sum+=array[p][q];
							
						}
					}
					long abs = Math.abs(sum-k);
					if (abs<max || (abs == max && sum < closestSum)) {
						max = abs;
						newx =i;
						newy =j;
						closestSum =sum;
					}else if(abs==max && sum == closestSum) {
						if (i+1<newx || (i + 1 == newx && j + 1 < newy)) {
							newx = i+1;
							newy = j+1;
						}
					}
					
				}
			}
			System.out.println("#"+t+" "+newx+" "+newy);
		}
		scan.close();
	}

}
