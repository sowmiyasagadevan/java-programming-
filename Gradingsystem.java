import java.util.Scanner;
class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark of Subject A: ");
        int a = sc.nextInt();
        System.out.println("Enter mark of Subject B: ");
        int b = sc.nextInt();
        System.out.println("Enter mark of Subject C: ");
        int c = sc.nextInt();
        System.out.println("Enter mark of Subject D: ");
        int d = sc.nextInt();

        int marks = (a+b+c+d)/4;

        if (marks>=90 && marks<=100){
            System.out.println("Grade: A");
        }else if (marks>=80 && marks<=89){
            System.out.println("Grade: B");
        }else if (marks>=70 && marks<=79){
            System.out.println("Grade: C");
        }else if (marks>=60 && marks<=69){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: F");
        }
    }
}