package ELearningPlatform;

public class CertificateIssuer {
    public void issueCertificate(User user, Course course) {
        System.out.println("Certificate issued to " + user.getName() + " for completing the course " + course.getCourseName());
    }
}

