import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,n= sc.nextInt();
        int spaces=2*n-2;
        for (i=1;i<=2*n-1;i++){
            int stars=i;
            if (i>n)stars=2*n-i;
            //stars
            for (j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for (j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<n)
                spaces -=2;
            else
                spaces +=2;
        }
    }
}
