import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int i,j,n = sc.nextInt();
        for ( i = 0; i < n; i++) {
            for (j=0;j < n ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}