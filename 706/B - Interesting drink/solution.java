import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] x = new int[n];
 
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
 
        Arrays.sort(x);
 
        int q = sc.nextInt();
 
        while (q-- > 0) {
            int m = sc.nextInt();
 
            int low = 0;
            int high = n - 1;
            int ans = 0;
 
            while (low <= high) {
                int mid = low + (high - low) / 2;
 
                if (x[mid] <= m) {
                    ans = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}