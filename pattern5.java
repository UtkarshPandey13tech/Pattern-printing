import java.util.Scanner;

public class pattern5{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i , j , n = sc.nextInt();
        int space = 2*(n-1);
        for (i=1;i<=n;i++){
            // numbers
            for (j=1;j<=i;j++){
                System.out.print(j);
            }
            for (j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space=space-2;
        }
    }
}
