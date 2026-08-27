import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int availableRooms = 0;
 
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                int q = sc.nextInt();
                if (q - p >= 2) {
                    availableRooms++;
                }
            }
 
            System.out.println(availableRooms);
        }
        sc.close();
    }
}