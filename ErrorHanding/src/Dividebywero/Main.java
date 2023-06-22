package Dividebywero;

public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            System.out.println("erreur car 3/0,C’est illégal");

        }
    }
}