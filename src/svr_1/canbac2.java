package svr_1;

import java.util.Scanner;

public class canbac2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		  int T = scan.nextInt();  // Số lượng test case

	        for (int i = 1; i <= T; i++) {
	            int a = scan.nextInt();
	          
	            System.out.print("#" + i + " ");

	            int k = (int) Math.sqrt(a);
	            System.out.println(k);
	            
	            System.out.println();  // In xuống dòng cho test case tiếp theo
	        }

	        scan.close();
	    }}
