package JavaProject;

public class Progress {
    private int completedModules;
    private boolean isCourseCompleted;

    public Progress() {
        this.completedModules = 0;
        this.isCourseCompleted = false;
    }

    public void completeModule() {
        this.completedModules++;
        if (completedModules == 10) { // Assuming 10 modules in the course
            this.isCourseCompleted = true;
        }
    }

    public int getCompletedModules() {
        return completedModules;
    }

    public boolean isCourseCompleted() {
        return isCourseCompleted;
    }

    public void addObserver(StudentProgressObserver observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addObserver'");
    }
}