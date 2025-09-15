import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i, n = sc.nextInt();
        char ch;
        for (i=0;i<n;i++) {
            for (ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
}
