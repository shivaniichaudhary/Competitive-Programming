import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null) return;
        
        int n = Integer.parseInt(line.trim());
        int groups = 0;
        String prev = "";
 
        for (int i = 0; i < n; i++) {
            String curr = br.readLine().trim();
            if (!curr.equals(prev)) {
                groups++;
                prev = curr;
            }
        }
 
        System.out.println(groups);
    }
}