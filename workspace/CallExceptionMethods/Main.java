package callexceptionmethods;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            // show error information with e.getMessage()
            System.err.println("getMessage():" + e.getMessage());
            // show stack trace of the error with e.printStackTrace();
            e.printStackTrace();
        }
    }
}
