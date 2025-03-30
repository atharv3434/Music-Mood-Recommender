public class MoodAnalyzer {
    public static String detectMood(String userText) {
        userText = userText.toLowerCase();

        if (userText.contains("happy") || userText.contains("excited") || userText.contains("joy")) return "Happy";
        if (userText.contains("sad") || userText.contains("heartbroken") || userText.contains("depressed")) return "Sad";
        if (userText.contains("relaxed") || userText.contains("calm") || userText.contains("peaceful")) return "Relaxed";
        if (userText.contains("energetic") || userText.contains("hyped") || userText.contains("motivated")) return "Energetic";

        return "Neutral"; // Default mood
    }
}
