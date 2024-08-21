package JavaProject;

public class Certificate {
    private String studentName;
    private String courseName;

    public Certificate(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }

    public void issueCertificate() {
        System.out.println("Certificate issued to " + studentName + " for completing " + courseName);
    }
}