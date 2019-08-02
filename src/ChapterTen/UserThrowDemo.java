package ChapterTen;

class MyException extends Exception {

    static int count = 0;
    String name;

    MyException(String name) {

        count++;
        this.name = name;
    }

    public String toString() {

        String text = "Mistake has appear!\n";
        text += "Description: " + name + '\n';
    }
}
public class UserThrowDemo {
}
