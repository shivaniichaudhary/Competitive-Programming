import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNext()) {
            String s = sc.next();
            Set<Character> distinctChars = new HashSet<>();
 
            for (char c : s.toCharArray()) {
                distinctChars.add(c);
            }
 
            if (distinctChars.size() % 2 == 0) {
                System.out.println("CHAT WITH HER!");
            } else {
                System.out.println("IGNORE HIM!");
            }
        }
        sc.close();
    }
}