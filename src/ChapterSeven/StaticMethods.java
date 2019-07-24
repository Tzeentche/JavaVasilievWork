package ChapterSeven;

import javax.swing.*;

class SecondClass {

    final static double PI = 3.14159265;
    static double sin(double x, int n) {

        double s = 0, q = x;
        int i;

        for (i = 1; i < n; i++) {

            s += q;
            q *= (-1) * x * x / (2 * i) / (2 * i + 1);
        }

        return s + q;
    }
}

public class StaticMethods {

    public static void main(String[] args) {

        String text = "Values Teilor's row for SIN.";

        for (int k = 0; k < 5; k++) {

            text += "\n Sum " + (k + 1) + ": ";
            text += "Sin (pi / 4) = " + SecondClass.sin(SecondClass.PI / 4, k);
        }

        JOptionPane.showMessageDialog(null, text);
    }
}
