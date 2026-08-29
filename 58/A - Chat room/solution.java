import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNext()) {
            String s = sc.next();
            String target = "hello";
            int p = 0;
 
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == target.charAt(p)) {
                    p++;
                    if (p == 5) {
                        break;
                    }
                }
            }
 
            if (p == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}