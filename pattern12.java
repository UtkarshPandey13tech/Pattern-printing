import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i , j , n = sc.nextInt();
        int inits=0;
        for (i=0;i<n;i++){
            //stars
            for (j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for (j=0;j<inits;j++){
                System.out.print(" ");
            }
            for (j=1;j<=n-i;j++){
                System.out.print("*");
            }
            inits +=2;
            System.out.println();
        }
        inits=2*n-2;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            for (j=0;j<inits;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            inits -=2;
            System.out.println();
        }
    }
}
