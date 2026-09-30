import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n % 3 != 0) {
                sb.append("First
");
            } else {
                sb.append("Second
");
            }
        }
 
        System.out.print(sb.toString());
    }
}