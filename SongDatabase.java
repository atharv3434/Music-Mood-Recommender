import java.util.*;

public class SongDatabase {
    private static final Map<String, List<String>> moodToSongs = new HashMap<>();

    static {
        moodToSongs.put("Happy", new ArrayList<>(Arrays.asList("Happy - Pharrell Williams", "Shake It Off - Taylor Swift")));
        moodToSongs.put("Sad", new ArrayList<>(Arrays.asList("Someone Like You - Adele", "Fix You - Coldplay")));
        moodToSongs.put("Relaxed", new ArrayList<>(Arrays.asList("Weightless - Marconi Union", "Sunflower - Post Malone")));
        moodToSongs.put("Energetic", new ArrayList<>(Arrays.asList("Eye of the Tiger - Survivor", "Can't Stop - Red Hot Chili Peppers")));
    }

    public static List<String> getSongsForMood(String mood) {
        return moodToSongs.getOrDefault(mood, Arrays.asList("🎵 No songs found for this mood!"));
    }

    public static void addCustomSong(String mood, String song) {
        moodToSongs.putIfAbsent(mood, new ArrayList<>());
        moodToSongs.get(mood).add(song);
    }
}
