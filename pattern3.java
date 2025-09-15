import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,n = sc.nextInt();
        for (i=1;i<=2*n-1;i++){
            int star=i;
            if (i>n)
                star=2*n-i;
            for (j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
