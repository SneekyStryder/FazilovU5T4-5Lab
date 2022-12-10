public class ActivityTracker {
    private int targetGoal;
    private int totalMinutes;
    private int totalSessions;
    private int maxMinutes;

    public ActivityTracker(int targetGoal) {
        this.targetGoal = targetGoal;
        totalMinutes = 0;
        totalSessions = 0;
        maxMinutes = 0;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public int getTotalSessions() {
        return totalSessions;
    }

    public int getMaxMinutes() {
        return maxMinutes;
    }

    public void trackMinutes(int minutes) {
        totalMinutes += minutes;
        totalSessions++;
        if (minutes > maxMinutes) {
            maxMinutes = minutes;
        }
    }

    public boolean achieved() {
        return (totalMinutes >= targetGoal);
    }

}
