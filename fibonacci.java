import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        fibo(n);

    }
    public static int fibo(int n){
        int first = 0;int  second =1;
        if (n>=1){
            System.out.println(first);
        }
        if (n>=2){
            System.out.println(second);

        }

        for ( int i=3;i<=n;i++){
           int  third = first +second;
            System.out.println(third);
            first = second;
            second=third;
        }

        return n;
    }

}
