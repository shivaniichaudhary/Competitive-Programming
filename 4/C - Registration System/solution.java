import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        int n = Integer.parseInt(line.trim());
        HashMap<String, Integer> db = new HashMap<>();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < n; i++) {
            String name = br.readLine().trim();
 
            if (!db.containsKey(name)) {
                db.put(name, 1);
                sb.append("OK
");
            } else {
                int count = db.get(name);
                sb.append(name).append(count).append("
");
                db.put(name, count + 1);
            }
        }
 
        System.out.print(sb.toString());
    }
}