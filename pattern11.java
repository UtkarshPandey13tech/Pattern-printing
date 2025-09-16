import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,n= sc.nextInt();
        char ch;
        for (i=0;i<n;i++){
            for (ch = (char)('E'-i) ; ch<='E';ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
}
