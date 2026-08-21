import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNext()) {
            String s = sc.next();
            String t = sc.next();
 
            String reversedS = new StringBuilder(s).reverse().toString();
 
            if (reversedS.equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}