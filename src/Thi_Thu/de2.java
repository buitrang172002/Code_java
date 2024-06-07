package Thi_Thu;


import java.util.*;
public class de2 {
	 static int[] dX = {-1, 0, 1, 0}; 
	 static int[] dY = {0, 1, 0, -1}; 

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int T = scanner.nextInt(); 

	        for (int t = 1; t <= T; t++) {
	            int N = scanner.nextInt();
	            int M = scanner.nextInt();
	            int K = scanner.nextInt();
	            int[] commands = new int[K];

	            for (int i = 0; i < K; i++) {
	                commands[i] = scanner.nextInt();
	            }

	            int[][] board = new int[N][M];
	            int startX = 0, startY = 0;

	            for (int i = 0; i < N; i++) {
	                for (int j = 0; j < M; j++) {
	                    board[i][j] = scanner.nextInt();
	                    if (board[i][j] == 2) {
	                        startX = i;
	                        startY = j;
	                    }
	                }
	            }

	            System.out.println("#" + t + " " + countUniquePositions(board, N, M, K, commands, startX, startY));
	        }
	        scanner.close();
	    }

	    public static int countUniquePositions(int[][] board, int N, int M, int K, int[] commands, int startX, int startY) {
	        Set<String> visited = new HashSet<>();
	        int x = startX, y = startY;
	        visited.add(x + "," + y);

	        for (int i = 0; i < K; i++) {
	            int command = commands[i] - 1; 
	            while (true) {
	                int newX = x + dX[command];
	                int newY = y + dY[command];

	                if (newX < 0 || newX >= N || newY < 0 || newY >= M || board[newX][newY] == 1) {
	                    break; 
	                }

	                x = newX;
	                y = newY;
	                visited.add(x + "," + y);
	            }
	        }

	        return visited.size();
	    }
	}