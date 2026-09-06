import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
 
            if (a % b == 0) {
                sb.append(0).append("
");
            } else {
                sb.append(b - (a % b)).append("
");
            }
        }
 
        System.out.print(sb.toString());
    }
}