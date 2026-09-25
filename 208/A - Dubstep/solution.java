import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) return;
 
        String result = s.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
        System.out.println(result);
    }
}