package ELearningPlatform;

public class Main {
    public static void main(String[] args) {
        // Create Course and User
        Course javaCourse = new Course("Java Programming");
        User john = new User("John Doe");

        // Enrollment
        Enrollment enrollment = Enrollment.getInstance();
        enrollment.enrollUser(john);

        // Check Enrollment
        if (enrollment.isUserEnrolled(john)) {
            System.out.println(john.getName() + " is enrolled in the course " + javaCourse.getCourseName());
        }

        // Progress Tracking
        ProgressTracker progressTracker = new ProgressTracker();
        progressTracker.updateProgress(john, 50);

        // Certificate Issuance
        if (progressTracker.getProgress(john) == 100) {
            CertificateIssuer certificateIssuer = new CertificateIssuer();
            certificateIssuer.issueCertificate(john, javaCourse);
        } else {
            System.out.println(john.getName() + " has not completed the course " + javaCourse.getCourseName() + " yet.");
        }
    }
}

