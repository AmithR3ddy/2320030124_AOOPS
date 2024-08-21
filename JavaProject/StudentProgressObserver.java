package JavaProject;

import java.util.Observable;
import java.util.Observer;

public class StudentProgressObserver implements Observer {
    private String studentName;

    public StudentProgressObserver(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Progress progress = (Progress) o;
        if (progress.isCourseCompleted()) {
            System.out.println(studentName + " has completed the course.");
            new Certificate(studentName, ((Course) arg).getName()).issueCertificate();
        } else {
            System.out.println(studentName + " has completed " + progress.getCompletedModules() + " modules.");
        }
    }
}