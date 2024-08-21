package JavaProject;
public class Course {
    private String name;
    private boolean isEnrolled;

    public Course(String name) {
        this.name = name;
        this.isEnrolled = false;
    }

    public void enroll() {
        this.isEnrolled = true;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public String getName() {
        return name;
    }
}
