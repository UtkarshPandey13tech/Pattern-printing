import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,n=sc.nextInt();
        for (i=0;i<n;i++){
            //space
            for (j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            //alphabet
            char ch ='A' ;
            int breakpoint = (2*i+1)/2;
            for (j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if (j<=breakpoint) ch++;
                else
                    ch--;
            }
            for (j=0;j<=n-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
