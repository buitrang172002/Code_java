package mang_svr;
import java.util.*;
public class PAIRS1E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan .nextInt();
		
		for (int i=1;i<=T;i++) {
			int N = scan.nextInt();
			int k = scan.nextInt();
			
			int []arr = new int[N];
			for (int j=0;j<N;j++) {
				arr[j] = scan.nextInt();
			}
			
			int sum =0;int hieu;
			for (int j=0;j<N;j++) {
				for (int l = j;l<N;l++) {
					if (arr[j]<arr[l]) {
						 hieu = arr[l] - arr[j];
					}else {
						hieu = arr[j] - arr[l];
					}
					
					if (hieu == k) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
	}

}
