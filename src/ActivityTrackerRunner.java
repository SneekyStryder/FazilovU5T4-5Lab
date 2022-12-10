import java.util.Scanner;

public class ActivityTrackerRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // target goal of 120 minutes of activity
        ActivityTracker tracker = new ActivityTracker(170);

        boolean cont = true;
        while (cont) {
            System.out.print("Enter the number of minutes for your activity session, -1 to end: ");
            int minutes = scan.nextInt();
            if (minutes == -1) {
                cont = false;
            }
            else {
                tracker.trackMinutes(minutes);
            }
        }
        System.out.println();
        System.out.println("Good job being active! Let's look at your stats: " +
                           "\nNumber of sessions: " + tracker.getTotalSessions() +
                           "\n Total number of minutes: " + tracker.getTotalMinutes() +
                           "\nLongest session logged (max minutes): " + tracker.getMaxMinutes() +
                           "\nYou reached your goal: " + tracker.achieved());
    }
}

