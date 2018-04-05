import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student st1 = new Student("Zhyrkova", 19, false, 10793225, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st2 = new Student("Hrushka", 19, false, 10793221, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st3 = new Student("Nedashkivskiy", 20, true, 10793222, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st4 = new Student("Mudriy", 19, true, 10793223, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st5 = new Student("Zhovtykhin", 19, true, 10793224, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st6 = new Student("Tsukanova", 20, false, 10793226, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st7 = new Student("Morenets", 20, true, 10793227, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st8 = new Student("Gorshkova", 19, false, 10793228, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st9 = new Student("Gomenyuk", 20, true, 10793229, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st10 = new Student("Degtiarenko", 20, true, 10793230, "Kyiv-Mohyla Academy", 3, "informatics", "information technology");
        Student st11 = new Student("Udalova", 20, true, 10793231, "Kyiv-Mohyla Academy", 3, "informatics", "programming engineering");


        Group gr = new Group();
        //gr.setNullGroup();

        try {
            gr.addStudent(st1);
            gr.addStudent(st2);
            gr.addStudent(st3);
            gr.addStudent(st4);
            gr.addStudent(st5);
            gr.addStudent(st6);
            gr.addStudent(st7);
            gr.addStudent(st8);
            gr.addStudent(st9);
            gr.addStudent(st10);
            gr.addStudent(st11);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        gr.removeStudent(st1);

        System.out.println(gr.toString());

        System.out.println(Arrays.toString(gr.getByStudentName("Morenets")));

        System.out.println(gr.toString());
    }
}
