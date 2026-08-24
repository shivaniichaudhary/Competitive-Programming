import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int currentPassengers = 0;
            int maxCapacity = 0;
 
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                currentPassengers -= a;
                currentPassengers += b;
                maxCapacity = Math.max(maxCapacity, currentPassengers);
            }
 
            System.out.println(maxCapacity);
        }
        sc.close();
    }
}