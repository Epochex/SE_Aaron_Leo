package dividebyzero;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}