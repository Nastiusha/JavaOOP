public class Triangle extends Shape {

    private Point a = new Point();
    private Point b = new Point();
    private Point c = new Point();

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    double getPerimetr() {
        return Math.sqrt(Math.pow((b.getY() - a.getY()), 2) + Math.pow((b.getX() - a.getX()), 2))
                + Math.sqrt(Math.pow((c.getY() - b.getY()), 2) + Math.pow((c.getX() - b.getX()), 2))
                + Math.sqrt(Math.pow((c.getY() - a.getY()), 2) + Math.pow((c.getX() - a.getX()), 2));
    }

    @Override
    double getArea() {
        double p = getPerimetr()/2;
        double ab = Math.sqrt(Math.pow((b.getY() - a.getY()), 2) + Math.pow((b.getX() - a.getX()), 2));
        double bc = Math.sqrt(Math.pow((c.getY() - b.getY()), 2) + Math.pow((c.getX() - b.getX()), 2));
        double ac = Math.sqrt(Math.pow((c.getY() - a.getY()), 2) + Math.pow((c.getX() - a.getX()), 2));

        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
}
