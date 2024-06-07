package Thi_Thu;

import java.util.Scanner;

public class de1 {
    public static char array[][] = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'},
        {'*', '0', '#'}
    };
    public static int x[] = {1, 0, -1, 0};
    public static int y[] = {0, 1, 0, -1};
    public static int T, N;

    public static int ktra(int a[], int b[], int n) {
        int errors = 0;
        int errorIndex = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                if (errors >= 1) {
                    return -1; 
                }
                char newx = (char)(a[i] + '0');
                char newy = (char)(b[i] + '0');
                boolean found = false; 
                for (int p = 0; p < 4 && !found; p++) {
                    for (int q = 0; q < 3 && !found; q++) {
                        if (array[p][q] == newx) { 
                            for (int k = 0; k < 4; k++) {
                                int newp = p + x[k];
                                int newq = q + y[k];
                                if (newp >= 0 && newp < 4 && newq >= 0 && newq < 3) {
                                    if (array[newp][newq] == newy) { 
                                        errors++;
                                        errorIndex = i + 1; 
                                        found = true; 
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!found) {
                    return -1; 
                }
            }
        }

        if (errors == 0) {
            return 0; 
        } else {
            return errorIndex; 
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        T = scan.nextInt();
        for (int t = 1; t <= T; t++) {
            N = scan.nextInt();
            int a[] = new int[N];
            int b[] = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = scan.nextInt();
            }
            for (int i = 0; i < N; i++) {
                b[i] = scan.nextInt();
            }
            System.out.println("#" + t + " " + ktra(a, b, N));
        }
        scan.close();
    }
}
