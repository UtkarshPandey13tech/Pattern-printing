import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);

      }
    public static int fact(int n) {
        // loop
        if (n<0){
            System.out.println("invalid number");
            return 0;
        }
        int facto = 1;
        for (int i = n; i >= 1; i--) {
            facto = facto * i;
        }
        System.out.println("factorial of " + n + "is " + facto);
        return facto;

    }
}
