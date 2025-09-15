import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j ,n= sc.nextInt();
        char ch;
        for (i=0;i<n;i++){
             ch = (char)('A'+ i);
            for (j=0;j<=i;j++){
                System.out.print(ch);

            }
            System.out.println();
        }
    }
}
