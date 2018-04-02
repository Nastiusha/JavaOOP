public class Main {

    public static void main(String[] args) {

        Point a1 = new Point();
        a1.setX(1);
        a1.setY(1);

        Point a2 = new Point();
        a2.setX(3);
        a2.setY(3);

        Point a3 = new Point();
        a3.setX(5);
        a3.setY(1);

        Triangle t1 = new Triangle();
        t1.setA(a1);
        t1.setB(a2);
        t1.setC(a3);

        System.out.println(t1.getPerimetr());
        System.out.println(t1.getArea());

        Circle c1 = new Circle();
        c1.setA(a2);
        c1.setO(a1);

        System.out.println(c1.getPerimetr());
        System.out.println(c1.getArea());

    }
}
