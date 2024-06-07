package mang_svr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FNDMTX {

    public static void main(String[] args) throws FileNotFoundException {
    	System.setIn(new FileInputStream("input.txt"));
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();  
        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();  
            int M = scan.nextInt(); 
            long K = scan.nextLong();  
            long array[][] = new long[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = scan.nextLong();  
                }
            }

           
            int xStart = 0, yStart = 0;
            long minDiff = Long.MAX_VALUE;
            long closestSum = Long.MAX_VALUE;

            
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    long sum = 0;
                    // Tính tổng của ma trận con MxM
                    for (int p = i; p < i + M; p++) {
                        for (int q = j; q < j + M; q++) {
                            sum += array[p][q];
                        }
                    }

                   
                    long diff = Math.abs(sum - K);

                    // Cập nhật kết quả nếu tìm được khoảng cách nhỏ hơn
                    if (diff < minDiff || (diff == minDiff && sum < closestSum)) {
                        minDiff = diff;
                        closestSum = sum;
                        xStart = i ; 
                        yStart = j ; 
                    } else if (diff == minDiff && sum == closestSum) {
                        // Nếu tổng bằng nhau, chọn chỉ số hàng nhỏ hơn
                        if (i + 1 < xStart || (i + 1 == xStart && j + 1 < yStart)) {
                            xStart = i + 1;
                            yStart = j + 1;
                        }
                    }
                }
            }

            System.out.println("#" + t + " " + xStart + " " + yStart);
        }
        scan.close();
    }
}
