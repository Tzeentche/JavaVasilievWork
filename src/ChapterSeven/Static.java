package ChapterSeven;

import javax.swing.*;

class FirstClass {

    static int N1;
    int N2;

    FirstClass (int n1, int n2) {

        N1 = n2;
        N2 = n2;

        String text = "Create new object! \n";
        text += "Static field: " + N1 + "\n";
        text += "Nonstatic field: " + N2;

        JOptionPane.showMessageDialog(null, text);
    }

    void show() {

        String text = "Object's fields! \n";
        text += "Static field: " + N1 + " \n";
        text += "Nonstatic field: " + N2;

        JOptionPane.showMessageDialog(null, text);
    }
}

public class Static {

    public static void main(String[] args) {

        FirstClass A = new FirstClass(10, 200);
        FirstClass.N1 = -50;

        A.show();

        FirstClass B = new FirstClass(1, 2);

        A.show();

        B.N1 = -1;
        B.N2 = -2;

        A.show();
    }
}
