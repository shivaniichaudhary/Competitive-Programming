import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    private static final int MAX_LIMIT = 1000000;
    private static boolean[] isPrime = new boolean[MAX_LIMIT + 1];
 
    private static void buildSieve() {
        for (int i = 2; i <= MAX_LIMIT; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= MAX_LIMIT; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= MAX_LIMIT; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }
 
    public static void main(String[] args) throws IOException {
        buildSieve();
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        int n = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0 && st.hasMoreTokens()) {
            long x = Long.parseLong(st.nextToken());
            long r = (long) Math.round(Math.sqrt(x));
 
            if (r * r == x && isPrime[(int) r]) {
                sb.append("YES
");
            } else {
                sb.append("NO
");
            }
        }
 
        System.out.print(sb.toString());
    }
}