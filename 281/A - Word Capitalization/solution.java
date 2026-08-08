import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        if (sc.hasNext()) {
            String s = sc.next();
            String result = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            System.out.println(result);
        }
        sc.close();
    }
}