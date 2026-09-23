import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            List<Integer> ans = new ArrayList<>();
            int multiplier = 1;
 
            while (n > 0) {
                int digit = n % 10;
                if (digit > 0) {
                    ans.add(digit * multiplier);
                }
                n /= 10;
                multiplier *= 10;
            }
 
            sb.append(ans.size()).append("
");
            for (int i = 0; i < ans.size(); i++) {
                sb.append(ans.get(i)).append(i == ans.size() - 1 ? "" : " ");
            }
            sb.append("
");
        }
 
        System.out.print(sb.toString());
    }
}