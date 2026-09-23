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
            long n = Long.parseLong(br.readLine().trim());
            sb.append((n - 1) / 2).append("
");
        }
 
        System.out.print(sb.toString());
    }
}