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
        text += "The number of mistake: " + count;

        return text;
    }
}

class MyClassThrow {

    private int number;

    void show() {

        System.out.println("Value of field: " + number);
    }

    MyClassThrow(int number) {

        try {

            if (number > 10) {

                number = 10;

                throw new MyException("It's too big number1");
            }

            if (number < 0) {

                number = 0;

                throw new MyException("It's a negative number!");
            }
        } catch (MyException obj) {

            System.out.println(obj);
        }

        this.number = number;
        show();
    }

    void set(int number) throws MyException {

        if (number > 10 || number < 0) throw new MyException("Wrong argue!");
        this.number = number;

        System.out.println("All right!");
        show();
    }
}

public class UserThrowDemo {

    public static void main(String[] args) {

        MyClassThrow objA = new MyClassThrow(15);

        MyClassThrow objB = new MyClassThrow(-1);

        try {

            objA.set(100);
        } catch (MyException e) {

            System.out.println(e);
            objA.show();
        }

        MyException objE = new MyException("It's none-mistake!");

        try {

            throw objE;
        } catch (MyException e) {

            System.out.println(e);
        }
    }
}
