import java.util.Scanner;
public class pattern15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of rows and column: ");
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println("Hollow Rectangle Pattern:");

            for (int i = 0; i < n; i++) { // Outer loop for rows
                for (int j = 0; j < m; j++) { // Inner loop for columns
                    // Check if it's a boundary position
                    if (i == 0 || i == n-1|| j == 0 || j == m-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println(); // Move to the next line after each row
            }

            sc.close();
        }
}
