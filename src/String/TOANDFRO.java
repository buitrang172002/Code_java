package String;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TOANDFRO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
 
            int n = scan.nextInt();
            scan.nextLine();  // Đọc bỏ dòng mới sau khi nhập số nguyên
            if (n == 0) break;

            String str = scan.nextLine();
            int m = str.length() / n;
            char[][] array = new char[m][n];
            int index = 0;

            for (int x = 0; x < m; x++) {
                if (x % 2 == 0) {
                    for (int y = 0; y < n; y++) {
                        array[x][y] = str.charAt(index++);
                    }
                } else {
                    for (int y = n - 1; y >= 0; y--) {
                        array[x][y] = str.charAt(index++);
                    }
                }
            }

            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    System.out.print(array[x][y]);
                }
            }
            System.out.println();  // Xuống dòng sau khi in mỗi test case
        }
        
        scan.close();
    }
}
