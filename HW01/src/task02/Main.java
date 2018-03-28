package task02;

public class Main {

    public static void main(String[] args) {

        /*Create t1*/
        Triangle t1 = new Triangle();
        t1.setA(1);
        t1.setB(1);
        t1.setC(1);
        /*Print t1 square*/
        System.out.println("S(t1) = " + t1.square() + "\n");

        /*Create t2*/
        Triangle t2 = new Triangle();
        t2.setA(3);
        t2.setB(4);
        t2.setC(5);
        /*Print t2 square*/
        System.out.println("S(t2) = " + t2.square() + "\n"); //This is Pifagor triangle. Its square must be 6.0
    }
}
