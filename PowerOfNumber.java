import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        int result = 1, i = 0;
        
        do {
            result *= base;
            i++;
        } while (i < exponent);
        
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        
        scanner.close();
    }
}
