public class Relational {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if(a>b && a>c){
            System.out.println("A is greater than B and C");
        } else if (b>a && b>c){
            System.out.println("B is greater than A and C");
        } else{
            System.out.println("C is greater than A and B");
        }
    }
}
