import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNext()) {
            String n = sc.next();
            int luckyCount = 0;
 
            for (char digit : n.toCharArray()) {
                if (digit == '4' || digit == '7') {
                    luckyCount++;
                }
            }
 
            if (luckyCount == 4 || luckyCount == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}