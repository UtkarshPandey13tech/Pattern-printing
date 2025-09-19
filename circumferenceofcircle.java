import java.util.Scanner;

public class circumferenceofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     cir(n);
    }
    public  static double cir(int n){
        double area = (2*3.14)*n;
        System.out.println(area);
        return area;
    }
}
