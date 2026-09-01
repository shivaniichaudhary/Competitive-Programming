import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            double sum = 0.0;
 
            for (int i = 0; i < n; i++) {
                sum += sc.nextDouble();
            }
 
            System.out.printf("%.12f
", sum / n);
        }
        sc.close();
    }
}