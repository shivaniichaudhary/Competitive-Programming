import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        // Using ceiling formula: (x + 4) / 5
        int steps = (x + 4) / 5;
        
        System.out.println(steps);
    }
}