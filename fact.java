public class fact {
    public static void main(String[] args) {
        int n =7;
        fact(n);

    }
    public static  int fact(int n){
        int factorial = 1;
        for (int i=1;i<=n;i++){
            factorial *=i;
        }
        System.out.println(factorial);
        return factorial;
    }
}
