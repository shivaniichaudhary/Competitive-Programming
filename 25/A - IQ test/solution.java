import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        int n = Integer.parseInt(line.trim());
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }
 
        if (evens.size() == 1) {
            System.out.println(evens.get(0));
        } else {
            System.out.println(odds.get(0));
        }
    }
}