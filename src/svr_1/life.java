package svr_1;

import java.util.Scanner;

public class life {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		int []a = new int[100];
		int i=0;
		do {
			
			n = scan.nextInt();
			a[i] = n;
			i++;
			
		}while (n!=42);
		
		for (int j=0;j<i-1;j++) {
			System.out.println(a[j]);
		}
	}

}
