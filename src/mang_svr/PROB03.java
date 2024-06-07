package mang_svr;

import java.util.Scanner;

public class PROB03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); 

        for (int t = 1; t <= T; t++) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            int M = scan.nextInt();
            int N = scan.nextInt();

            int[][] array = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = scan.nextInt();
                }
            }

            int maxSum = 0;

            for (int i = 0; i <= M - H; i++) {
                for (int j = 0; j <= N - W; j++) {
                    int sum = 0;
                    // Top border
                    for (int y = j; y < j + W; y++) {
                        if (array[i][y] % 2 == 0) {
                            sum += array[i][y];
                        }
                    }
                    // Bottom border
                    for (int y = j; y < j + W; y++) {
                        if (array[i + H - 1][y] % 2 == 0) {
                            sum += array[i + H - 1][y];
                        }
                    }
                    // Left border (excluding corners)
                    for (int x = i + 1; x < i + H - 1; x++) {
                        if (array[x][j] % 2 == 0) {
                            sum += array[x][j];
                        }
                    }
                    // Right border (excluding corners)
                    for (int x = i + 1; x < i + H - 1; x++) {
                        if (array[x][j + W - 1] % 2 == 0) {
                            sum += array[x][j + W - 1];
                        }
                    }

                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }

            System.out.println("#" + t + " " + maxSum);
        }

        scan.close();
    }
}
