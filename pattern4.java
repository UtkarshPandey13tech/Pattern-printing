import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,start=1;
        for (i=0;i<n;i++){
            if (i%2==0)
                start=1;
            else
                start=0;
            for (j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
