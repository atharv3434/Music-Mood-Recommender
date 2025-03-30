import java.util.Scanner;
import java.util.List;

public class MusicRecommender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎵 AI-Powered Music Mood Recommender 🎶");

        while (true) {
            System.out.println("\n1. Enter Your Mood");
            System.out.println("2. Add Custom Song");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nHow are you feeling today? (Describe your mood): ");
                    String userMood = sc.nextLine();
                    String detectedMood = MoodAnalyzer.detectMood(userMood);
                    List<String> songRecommendations = SongDatabase.getSongsForMood(detectedMood);

                    System.out.println("\n🎧 Based on your mood (" + detectedMood + "), we recommend:");
                    for (String song : songRecommendations) {
                        System.out.println("   🎵 " + song);
                    }
                    break;

                case 2:
                    System.out.print("\nEnter Song Name: ");
                    String song = sc.nextLine();
                    System.out.print("Enter Mood Category (Happy/Sad/Relaxed/Energetic): ");
                    String mood = sc.nextLine();
                    SongDatabase.addCustomSong(mood, song);
                    System.out.println("✅ Song added successfully!");
                    break;

                case 3:
                    System.out.println("Exiting... Enjoy your music! 🎶");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
