import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] coins = {100, 20, 10, 5, 1};
 
        int ans = 0;
 
        for (int coin : coins) {
            ans += n / coin;
            n %= coin;
        }
 
        System.out.println(ans);
    }
}