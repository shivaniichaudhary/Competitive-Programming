import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            Set<Character> vowels = Set.of('a', 'o', 'y', 'e', 'u', 'i');
            StringBuilder result = new StringBuilder();
 
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!vowels.contains(c)) {
                    result.append('.').append(c);
                }
            }
 
            System.out.println(result.toString());
        }
        sc.close();
    }
}