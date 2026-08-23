import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    private static boolean hasDistinctDigits(int year) {
        String s = String.valueOf(year);
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size() == s.length();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNextInt()) {
            int y = sc.nextInt();
 
            while (true) {
                y++;
                if (hasDistinctDigits(y)) {
                    System.out.println(y);
                    break;
                }
            }
        }
        sc.close();
    }
}