package svr_1;

import java.util.Scanner;

public class socp {

	public static boolean ktraCP(int n) {
		int x = (int) Math.sqrt(n);
		if (x*x == n)	return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();  // Số lượng test case

        for (int i = 1; i <= T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.print("#" + i + " ");

            boolean hasSquareNumber = false;  // Biến kiểm tra có số chính phương trong khoảng không

            for (int j = a; j <= b; j++) {
                if (ktraCP(j)) {
                    System.out.print(j + " ");
                    hasSquareNumber = true;
                }
            }

            if (!hasSquareNumber) {
                System.out.print("NO NUMBER");
            }

            System.out.println();  // In xuống dòng cho test case tiếp theo
        }

        scan.close();
    }}
