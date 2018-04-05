import java.util.Arrays;

public class Group {

    private Student[] group = new Student[10];

    public Group() {
    }

    public Group(Student[] group) {
        this.group = group;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + Arrays.toString(group) +
                '}';
    }

//    public Student[] setNullGroup() {
//        for (int i = 0; i < 10; i++) {
//            group[i] = snull;
//        }
//        return group;
//    }

    Student def = new Student("", 0, false, 0, "", 0, "", "");

    public Student[] addStudent(Student st) throws MyException {
        int nullStudents = 0;

        //Setting students with null value as default to avoid NullPointerException
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = def;
            }
        }

        //Add new student
        for (int i = 0; i < group.length; i++) {
            if (group[i].getName() == "") {
                group[i] = st;
                nullStudents++;
                break;
            }
        }

        //If array has a none place to add a new student, then an Exception is outputted
        if (nullStudents == 0) {
                throw new MyException();
        }
            return group;
    }

    public Student[] removeStudent(Student st) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == st) {
                group[i] = def;
                break;
            }
        }
        return group;
    }

    public Student[] getByStudentName (String name) {
        Student[] st = new Student[1];

        for (int i = 0; i < group.length; i++) {
            if (group[i].getName() == name) {
                st[0] = group[i];
            }
        }

        return st;

    }

}
