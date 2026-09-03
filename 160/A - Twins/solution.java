import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            Integer[] coins = new Integer[n];
            int totalSum = 0;
 
            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt();
                totalSum += coins[i];
            }
 
            // Sort coins in descending order
            Arrays.sort(coins, Collections.reverseOrder());
 
            int mySum = 0;
            int coinsCount = 0;
 
            for (int coin : coins) {
                mySum += coin;
                coinsCount++;
                if (mySum > totalSum / 2) {
                    break;
                }
            }
 
            System.out.println(coinsCount);
        }
        sc.close();
    }
}