import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String guest = br.readLine();
        String host = br.readLine();
        String pile = br.readLine();
 
        if (guest == null || host == null || pile == null) return;
 
        char[] combined = (guest.trim() + host.trim()).toCharArray();
        char[] pileArr = pile.trim().toCharArray();
 
        Arrays.sort(combined);
        Arrays.sort(pileArr);
 
        if (Arrays.equals(combined, pileArr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}