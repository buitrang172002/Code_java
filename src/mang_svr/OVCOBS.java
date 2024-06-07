package mang_svr;

import java.util.Scanner;

public class OVCOBS {

    // Các hướng di chuyển xung quanh
    public static int dx[] = {-1, 0, 0, 1, -1, -1, 1, 1};
    public static int dy[] = {0, 1, -1, 0, 1, -1, -1, 1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();  

        for (int t = 1; t <= T; t++) {
            int N = scan.nextInt();  
            int startX = scan.nextInt();  
            int startY = scan.nextInt();  
            long array[][] = new long[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = scan.nextLong();  
                }
            }

            boolean isVisited[][] = new boolean[N][N];
            isVisited[startX][startY] = true;
            int x = startX;
            int y = startY;
            int count = 0;

            while (true) {
                long min = Long.MAX_VALUE;
                int newX = -1, newY = -1;
                int kt = 0;
                for (int i = 0; i < 8; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < N && !isVisited[nx][ny]) {
                        if (array[nx][ny] > array[x][y] && array[nx][ny] < min) {
                            min = array[nx][ny];
                            newX = nx;
                            newY = ny;
                            kt =1;
                        }
                    }
                }

                if (kt==0) {
                    break; // Không tìm thấy chướng ngại vật cao hơn để nhảy
                }

                // Cập nhật vị trí mới
                x = newX;
                y = newY;
                isVisited[x][y] = true;
                count++;
            }

            System.out.println("#" + t + " " + count);
        }

        scan.close();
    }
}
