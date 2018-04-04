public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("Zhyrkova", 19, false, 10793225, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");

        System.out.println(st1.toString());

        Group gr = new Group();
        gr.addStudent(st1);
        gr.removeStudent(st1);
        gr.findStudent("Zhyrkova");

        System.out.println(gr.toString());
    }
}
