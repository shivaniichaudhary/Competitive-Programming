import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int a = sc.nextInt(); // Timur's distance
            int b = sc.nextInt(); // Participant 2
            int c = sc.nextInt(); // Participant 3
            int d = sc.nextInt(); // Participant 4
 
            int count = 0;
 
            if (b > a) count++;
            if (c > a) count++;
            if (d > a) count++;
 
            System.out.println(count);
        }
 
        sc.close();
    }
}