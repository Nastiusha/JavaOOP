package task03;

public class Vector3d {

    private double x;
    private double y;
    private double z;
    
    public Vector3d() {
    }

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(double y) {

        this.y = y;
    }

    public double getZ() {

        return z;
    }

    public void setZ(double z) {

        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Vector3d addition(Vector3d v1, Vector3d v2) {

        double x1 = v1.getX();
        double y1 = v1.getY();
        double z1 = v1.getZ();

        double x2 = v2.getX();
        double y2 = v2.getY();
        double z2 = v2.getZ();

        double x3 = x1 + x2;
        double y3 = y1 + y2;
        double z3 = z1 + z2;

        Vector3d v3 = new Vector3d();
        v3.setX(x3);
        v3.setY(y3);
        v3.setZ(z3);

        return v3;
    }

    public double scalar_multiply(Vector3d v1, Vector3d v2) {

        double x1 = v1.getX();
        double y1 = v1.getY();
        double z1 = v1.getZ();

        double x2 = v2.getX();
        double y2 = v2.getY();
        double z2 = v2.getZ();

        double v12 = x1*x2 + y1*y2 + z1*z2;

        return v12;
    }

    public Vector3d vector_multiply(Vector3d v1, Vector3d v2) {

        double x1 = v1.getX();
        double y1 = v1.getY();
        double z1 = v1.getZ();

        double x2 = v2.getX();
        double y2 = v2.getY();
        double z2 = v2.getZ();

        Vector3d v12 = new Vector3d();

        v12.setX(y1*z2 - y2*z1);
        v12.setY(-(x1*z2 - x2*z1));
        v12.setZ(x1*y2 - x2*y1);

        return v12;
    }
}
