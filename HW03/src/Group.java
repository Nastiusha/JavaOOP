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

    public Student[] addStudent(Student st) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = st;
                break;
            }
        }
        return group;
    }

    public Student[] removeStudent(Student st) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == st) {
                group[i] = null;
                break;
            }
        }
        return group;
    }

    public String[] getStudentNames () {
        String[] grNames = new String[10];

        for (int i = 0; i < grNames.length; i++) {
            grNames[i] = group[i].getName();
        }

        return grNames;

    }

}
