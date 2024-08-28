package ELearningPlatform;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private static Enrollment instance;
    private List<User> enrolledUsers;

    private Enrollment() {
        enrolledUsers = new ArrayList<>();
    }

    public static Enrollment getInstance() {
        if (instance == null) {
            instance = new Enrollment();
        }
        return instance;
    }

    public void enrollUser(User user) {
        enrolledUsers.add(user);
        System.out.println("User " + user.getName() + " enrolled successfully.");
    }

    public boolean isUserEnrolled(User user) {
        return enrolledUsers.contains(user);
    }
}
