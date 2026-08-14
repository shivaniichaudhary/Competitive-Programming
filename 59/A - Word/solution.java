import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNext()) {
            String s = sc.next();
            int upperCount = 0;
 
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    upperCount++;
                }
            }
 
            int lowerCount = s.length() - upperCount;
 
            if (upperCount > lowerCount) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s.toLowerCase());
            }
        }
        sc.close();
    }
}