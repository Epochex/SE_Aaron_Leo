package assertexample;
import javax.swing.*;

class Diamond {
    static void printDiamond(int size) {
        String diamond = "";
        /* print upper triangle */
        for (int r = 1, a = 1; r <= size; r++, a+=2) {
            /* print spaces */
            for (int i = size - r; i >= 1; i--) {
                diamond += " ";
            }
            /* print *'s */
            for (int j = 1; j <= a; j++) {
                diamond += "*";
            }
            diamond += "\n";
        }
        /* print lower triangle */
        for (int r = size - 1, a = 2*(size-1)-1; r >= 1; r--, a-=2) {
            /* print spaces */
            for (int i = size - r; i >= 1; i--) {
                diamond += " ";
            }
            /* print *'s */
            for (int j = 1; j <= a; j++) {
                diamond += "*";
            }
            diamond += "\n";
        }
        JOptionPane.showMessageDialog(null, diamond);
        System.out.println(diamond);
    }

    public static void main(String args[]) {
        String strSize;
        // Get the size of the diamond to draw
        strSize = JOptionPane.showInputDialog(null, "Enter diamond size:");
        int size = Integer.parseInt(strSize);
        // Assert that the value entered is greater than 0 and less than or equal to 20, otherwise,
        // it will generate AssertionError exception.
        if (size > 20) {
            throw new AssertionError("Size should be less than or equal to 20.");
        }
        try {
            assert(size > 0);
            printDiamond(size);
        } catch (AssertionError e) {
            JOptionPane.showMessageDialog(null, "AssertionError is captured: Size should be > 0.");
        }
        System.exit(0);
    }
}