import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the no.");
        int i ,j,n= sc.nextInt();
        for (i=0;i<n;i++){
            for (j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
