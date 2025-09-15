import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j;
        int n=sc.nextInt();
        int num=1;
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
        num =1;
        for (i=0;i<5;i++){
            for (j=0;j<=i;j++){
                System.out.print(num +" ");
                num +=1;
            }
            System.out.println();
        }
    }
}
