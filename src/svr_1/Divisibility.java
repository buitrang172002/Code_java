package svr_1;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		
			n = scan.nextInt();
			for (int i=0;i<n;i++) {
				int t = scan.nextInt();
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				for (int j=2;j<=t;j++)			
					if ((j%x==0) && (j%y!=1)) {
						System.out.print(j + " ");
					}
				System.out.print("\n");
			}
			
		
	}

}
