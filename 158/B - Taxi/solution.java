import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
 
        int n = Integer.parseInt(line.trim());
        
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());
            if (s == 1) count1++;
            else if (s == 2) count2++;
            else if (s == 3) count3++;
            else if (s == 4) count4++;
        }
 
        int taxis = 0;
 
        // 1. Taxis for groups of 4
        taxis += count4;
 
        // 2. Taxis for groups of 3 (pair each with a group of 1 if available)
        taxis += count3;
        count1 = Math.max(0, count1 - count3);
 
        // 3. Taxis for groups of 2 (pair two groups of 2 together)
        taxis += count2 / 2;
        if (count2 % 2 != 0) {
            taxis += 1; // One group of 2 remains, takes a new taxi
            count1 = Math.max(0, count1 - 2); // Remaining 2 seats can fit up to two size-1 groups
        }
 
        // 4. Remaining groups of 1 (fit up to 4 per taxi)
        if (count1 > 0) {
            taxis += (count1 + 3) / 4; // Ceiling division
        }
 
        System.out.println(taxis);
    }
}