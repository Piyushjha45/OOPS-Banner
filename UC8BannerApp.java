import java.util.HashMap;
import java.util.Map;

public class UC8BannerApp {

    // 1. Data Structure: Using HashMap for efficient pattern management
    private static final Map<Character, String[]> bannerMap = new HashMap<>();

    // Static initializer to populate the map
    static {
        bannerMap.put('O', new String[]{
            " $$$ ",
            "$   $",
            "$   $",
            " $$$ "
        });
        bannerMap.put('P', new String[]{
            "$$$$ ",
            "$   $",
            "$$$$ ",
            "$    "
        });
        bannerMap.put('S', new String[]{
            " $$$ ",
            "$    ",
            " $$$ ",
            "    $"
        });
        // You can easily add more characters here
    }

    // 2. Method to retrieve pattern using Map lookup
    public static String[] getPatternForChar(char c) {
        // Returns the pattern if found, otherwise returns a blank space pattern
        return bannerMap.getOrDefault(c, new String[]{"     ", "     ", "     ", "     "});
    }

    public static void main(String[] args) {
        String wordToDisplay = "OOPS";
        displayBanner(wordToDisplay);
    }

    public static void displayBanner(String word) {
        // The display logic remains consistent but now utilizes the map
        for (int i = 0; i < 4; i++) { // Height of ASCII art
            StringBuilder row = new StringBuilder();
            for (char c : word.toCharArray()) {
                row.append(getPatternForChar(c)[i]).append("  ");
            }
            System.out.println(row.toString());
        }
    }
}
