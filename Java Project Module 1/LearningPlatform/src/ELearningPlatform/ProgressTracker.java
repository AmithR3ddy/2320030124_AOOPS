package ELearningPlatform;

import java.util.HashMap;
import java.util.Map;

public class ProgressTracker {
    private Map<User, Integer> progressMap = new HashMap<>();

    public void updateProgress(User user, int progress) {
        progressMap.put(user, progress);
        System.out.println("User " + user.getName() + " progress updated to " + progress + "%.");
    }

    public int getProgress(User user) {
        return progressMap.getOrDefault(user, 0);
    }
}

