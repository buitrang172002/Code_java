package Thi_Thu;

import java.util.Scanner;

public class CKCPWD {
	public static char array[][] = {
			{'1','2','3'},
			{'4','5','6'},
			{'7','8','9'},
			{'*','0','#'}
	};
	public static int x[]= {1,0,-1,0};
	public static int y[]= {0,1,0,-1};
	public static int T, N;
	public static int ktra(int a[], int b[],int n) {
		int kt =0;
		
		for (int i=0;i<n;i++) {
			if (a[i]==b[i])	{
				kt = 0;
			}else {
				String newx = String.valueOf(a[i]);
				String newy = String.valueOf(b[i]);
				boolean check = false;
				for (int p=0;p<4;p++) {
					for (int q=0;q<3;q++) {
						for (int k=0;k<4;k++) {
							int newp = p + x[k];
							int newq = q + y[k];
							if (newp>=0 && newp<4 && newq>=0 && newq<3 && !check) {
								if (String.valueOf(array[p][q]).equals(newx) && String.valueOf(array[newp][newq]).equals(newy)) {
									kt = i+1;
									check = true;
									break;
								}else {
									kt = -1;
									break;
								}
							}
							
						}
					}
					if (!check)	break;
				}
			}
		}
		return kt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		T = scan.nextInt();
		for(int t=1;t<=T;t++) {
			N = scan.nextInt();
			int a[] = new int[N];
			int b[] = new int[N];
			for (int i=0;i<N;i++) {
				a[i] = scan.nextInt();
			}
			
			for (int i=0;i<N;i++) {
				b[i] = scan.nextInt();
			}
			System.out.println("#"+t+" "+ktra(a,b,N));
			
		}
		scan.close();
	}

}
