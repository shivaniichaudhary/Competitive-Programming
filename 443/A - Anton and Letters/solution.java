import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextLine()) {
            String line = sc.nextLine();
            Set<Character> distinctLetters = new HashSet<>();
 
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    distinctLetters.add(c);
                }
            }
 
            System.out.println(distinctLetters.size());
        }
        sc.close();
    }
}