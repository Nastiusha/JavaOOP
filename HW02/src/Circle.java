public class Circle extends Shape {

    private Point o = new Point();
    private Point a = new Point();

    public Circle(Point o, Point a) {
        this.o = o;
        this.a = a;
    }

    public Circle() {
        super();
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    @Override
    double getPerimetr() {
        // p = 2 * pi * r
        return 2 * Math.PI * Math.sqrt(Math.pow((a.getY() - o.getY()), 2) + Math.pow((a.getX() - o.getX()), 2));
    }

    @Override
    double getArea() {
        // S = pi * (r^2)
        return Math.PI * Math.pow(Math.sqrt(Math.pow((a.getY() - o.getY()), 2) + Math.pow((a.getX() - o.getX()), 2)), 2);
    }
}
