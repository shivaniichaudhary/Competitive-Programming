import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int[] f = new int[m];
 
        for (int i = 0; i < m; i++) {
            f[i] = sc.nextInt();
        }
 
        Arrays.sort(f);
 
        int minDiff = Integer.MAX_VALUE;
 
        for (int i = 0; i <= m - n; i++) {
            int diff = f[i + n - 1] - f[i];
 
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
 
        System.out.println(minDiff);
        sc.close();
    }
}