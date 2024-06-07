package mang_svr;
import java.util.*;

public class QKPE {
    // Các bước di chuyển của quân mã
    public static int[] knightX = {1, -1, 1, -1, 2, 2, -2, -2};
    public static int[] knightY = {2, 2, -2, -2, 1, -1, 1, -1};
    // Các bước di chuyển của quân hậu
    public static int[] queenX = {1, 0, -1, 0, 1, -1, 1, -1};
    public static int[] queenY = {0, 1, 0, -1, 1, 1, -1, -1};
    public static int m, n;
    
    public static boolean check(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= m;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int boardNumber = 0;

        while (true) {
            n = scan.nextInt();
            m = scan.nextInt();

            if (n == 0 && m == 0) break;
            boardNumber++;
            int[][] board = new int[n + 1][m + 1];

            // Đọc vị trí của quân hậu
            int numberOfQueens = scan.nextInt();
            int[][] hau = new int[numberOfQueens + 1][2];
            for (int i = 1; i <= numberOfQueens; i++) {
                hau[i][0] = scan.nextInt();
                hau[i][1] = scan.nextInt();
                board[hau[i][0]][hau[i][1]] = 1; // Queen
            }

            // Đọc vị trí của quân mã
            int numberOfKnights = scan.nextInt();
            int[][] ma = new int[numberOfKnights + 1][2];
            for (int i = 1; i <= numberOfKnights; i++) {
                ma[i][0] = scan.nextInt();
                ma[i][1] = scan.nextInt();
                board[ma[i][0]][ma[i][1]] = 2; // Knight
            }

            // Đọc vị trí của quân tốt
            int numberOfPawns = scan.nextInt();
            int[][] tot = new int[numberOfPawns + 1][2];
            for (int i = 1; i <= numberOfPawns; i++) {
                tot[i][0] = scan.nextInt();
                tot[i][1] = scan.nextInt();
                board[tot[i][0]][tot[i][1]] = 3; // Pawn
            }

            // Đánh dấu các ô bị quân hậu tấn công
            for (int i = 1; i <= numberOfQueens; i++) {
                int x = hau[i][0];
                int y = hau[i][1];
                for (int d = 0; d < 8; d++) {
                    int nx = x + queenX[d];
                    int ny = y + queenY[d];
                    while (check(nx, ny)) {
                        if (board[nx][ny] != 0) break; // Dừng lại nếu gặp quân cờ khác
                        board[nx][ny] = 4;
                        nx += queenX[d];
                        ny += queenY[d];
                    }
                }
            }

            // Đánh dấu các ô bị quân mã tấn công
            for (int i = 1; i <= numberOfKnights; i++) {
                int x = ma[i][0];
                int y = ma[i][1];
                for (int d = 0; d < 8; d++) {
                    int nx = x + knightX[d];
                    int ny = y + knightY[d];
                    if (check(nx, ny) && board[nx][ny] == 0) {
                        board[nx][ny] = 4;
                    }
                }
            }

            // Đếm số ô an toàn
            int safeSquares = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (board[i][j] == 0) {
                        safeSquares++;
                    }
                }
            }

            System.out.println("Board " + boardNumber + " has " + safeSquares + " safe squares.");
        }
        scan.close();
    }
}
