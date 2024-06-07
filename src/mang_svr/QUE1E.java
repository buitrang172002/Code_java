package mang_svr;

import java.util.Scanner;

public class QUE1E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for (int t =1;t<=T;t++) {
			int n = scan.nextInt();
			int []arr1 = new int[n];
			int []arr2 = new int[n];
			int arr[] = new int[n];
			int ischeck[] = new int[n];
			for (int i=0;i<n;i++) {
				arr1[i] = scan.nextInt();			
			}
			for (int i=0;i<n;i++) {
				arr2[i] = scan.nextInt();
			}
			for (int i=0;i<n;i++) {
				for (int j=i+1;j<n;j++) {
					if (arr2[i] == arr2[j]) {
						ischeck[j]  = 1;
					}
				}
			}
		
			for (int i=0;i<n;i++) {	
				if (ischeck[i]==0)
					arr[i] = arr1[arr2[i]];	
				else {
					//int pos = arr2[i];
					for (int j=i;j<n;j++) {
						for (int p =j+1;p<n;p++) {
							if (arr2[j]>arr2[p]) {
								arr[i] = arr1[j];
							}else {
								arr[i] = arr1[p];
							}
						}
					}
				}
			}
			
			for (int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

}
