import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
 
public class Main {
    static class Dragon {
        int x, y;
        Dragon(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        StringTokenizer st = new StringTokenizer(line);
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
 
        Dragon[] dragons = new Dragon[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dragons[i] = new Dragon(x, y);
        }
 
        // Sort dragons by required strength ascending
        Arrays.sort(dragons, Comparator.comparingInt(d -> d.x));
 
        boolean canWin = true;
        for (int i = 0; i < n; i++) {
            if (s > dragons[i].x) {
                s += dragons[i].y;
            } else {
                canWin = false;
                break;
            }
        }
 
        if (canWin) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}