import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int time = 240 - k;
        int count = 0;
 
        for (int i = 1; i <= n; i++) {
            time -= 5 * i;
 
            if (time >= 0) {
                count++;
            } else {
                break;
            }
        }
 
        System.out.println(count);
        sc.close();
    }
}