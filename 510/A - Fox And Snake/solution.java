import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
 
        StringBuilder sb = new StringBuilder();
 
        for (int r = 1; r <= n; r++) {
            if (r % 2 != 0) {
                for (int c = 0; c < m; c++) sb.append('#');
            } else if (r % 4 == 2) {
                for (int c = 0; c < m - 1; c++) sb.append('.');
                sb.append('#');
            } else if (r % 4 == 0) {
                sb.append('#');
                for (int c = 0; c < m - 1; c++) sb.append('.');
            }
            sb.append('
');
        }
 
        System.out.print(sb.toString());
    }
}