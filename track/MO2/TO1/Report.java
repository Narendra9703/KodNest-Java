package track.MO2.TO1;

public class Report {
    public static void main(String[] args) {
        // write your code here
        int completedTopics = 17;
        int totalTopics = 20;
        int dailylearninghours = 3;

        int learningdays = 5;
        double progressPercentage = (double) completedTopics * 100 / totalTopics;

        int weeklyLearning = dailylearninghours * learningdays;
        int remainingTopics = totalTopics - completedTopics;

        System.out.println("Completed Topics: " + completedTopics);

        System.out.println("Remaining Topics: " + remainingTopics);

        System.out.println("Weekly Learning Hours: " + weeklyLearning);

        System.out.println("Progress Percentage: " + progressPercentage);

    }

}
