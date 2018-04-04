public class Student extends Human {

    private int creditBookNumber;
    private String institution;
    private int course;
    private String faculty;
    private String specialization;

    public Student(String name, int age, boolean male, int creditBookNumber, String institution, int course, String faculty, String specialization) {
        super(name, age, male);
        this.creditBookNumber = creditBookNumber;
        this.institution = institution;
        this.course = course;
        this.faculty = faculty;
        this.specialization = specialization;
    }

    public Student() {
        super();
    }

    public int getCreditBookNumber() {
        return creditBookNumber;
    }

    public void setCreditBookNumber(int creditBookNumber) {
        this.creditBookNumber = creditBookNumber;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "creditBookNumber=" + creditBookNumber +
                ", institution='" + institution + '\'' +
                ", course=" + course +
                ", faculty='" + faculty + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
