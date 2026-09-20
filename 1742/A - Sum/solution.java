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
 
        while (t > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;
 
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
 
            if (a + b == c || a + c == b || b + c == a) {
                sb.append("YES
");
            } else {
                sb.append("NO
");
            }
            t--;
        }
 
        System.out.print(sb.toString());
    }
}