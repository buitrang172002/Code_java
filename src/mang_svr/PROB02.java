package mang_svr;
import java.util.*;
public class PROB02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dem[] = new int[5];
		
		int T = scan.nextInt();
		for (int t = 1;t<=T;t++) {
			int M = scan.nextInt();
			int N = scan.nextInt();
			
			for (int i=0;i<5;i++) {
				dem[i] = 0;
			}
			scan.nextLine();
			char arr[][] = new char[5*M+1][5*N+1];
			
			
			for (int i = 0; i < 5 * M + 1; i++) {
                String line = scan.next();
                for (int j = 0; j < 5 * N + 1; j++) {
                    arr[i][j] = line.charAt(j);
                }
            }
			
			for (int i=1;i<5*M+1;i+=5) {
				for (int j=1;j<5*N+1;j+=5) {
					int count = 0;
					for (int k=i;k<i+4;k++) {
						if (arr[k][j] == '*')	count++;
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
