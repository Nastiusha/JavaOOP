package task03;

public class Main {

    public static void main(String[] args) {

        /*Create v1*/
        Vector3d v1 = new Vector3d();
        v1.setX(2);
        v1.setY(4);
        v1.setZ(1);

        /*Create v2*/
        Vector3d v2 = new Vector3d();
        v2.setX(3);
        v2.setY(5);
        v2.setZ(3);

        /*v1 and v2 vectors output*/
        System.out.println("v1 = " + v1.toString());
        System.out.println("v2 = " + v2.toString());

        /*An addition of v1 and v2 vectors*/
        Vector3d v1plus2 = new Vector3d();
        System.out.println("v1plus2 = " + v1plus2.addition(v1, v2));

        /*Scalar multiply of v1 and v2 vectors*/
        Vector3d v12 = new Vector3d();
        System.out.println("v12 = " + v12.scalarMultiply(v1, v2));

        /*Vector multiply of v1 and v2 vectors*/
        Vector3d v12_1 = new Vector3d();
        System.out.println("v12_1 = " + v12_1.vectorMultiply(v1, v2));

    }
}
