package JavaProject;

public class ELearningPlatform {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");
        Progress progress = new Progress();

        course.enroll();

        StudentProgressObserver observer = new StudentProgressObserver("John Doe");
        progress.addObserver(observer);

        for (int i = 0; i < 10; i++) {
            progress.completeModule();
        }
    }
}

