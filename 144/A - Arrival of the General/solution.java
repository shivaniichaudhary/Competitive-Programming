import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] a = new int[n];
 
            int maxVal = -1, maxIdx = -1;
            int minVal = 101, minIdx = -1;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
 
                if (a[i] > maxVal) {
                    maxVal = a[i];
                    maxIdx = i;
                }
 
                if (a[i] <= minVal) {
                    minVal = a[i];
                    minIdx = i;
                }
            }
 
            int moves = maxIdx + (n - 1 - minIdx);
            if (maxIdx > minIdx) {
                moves--;
            }
 
            System.out.println(moves);
        }
        sc.close();
    }
}