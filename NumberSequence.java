import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        System.out.print("The first " + n + " natural numbers are ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + (i < n ? ", " : ".")); 
        }
        
        scanner.close();
    }
}
