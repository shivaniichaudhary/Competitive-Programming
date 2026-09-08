import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            String s = sc.next();
 
            if (n < 26) {
                System.out.println("NO");
            } else {
                Set<Character> uniqueLetters = new HashSet<>();
                for (char c : s.toLowerCase().toCharArray()) {
                    uniqueLetters.add(c);
                }
 
                if (uniqueLetters.size() == 26) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}