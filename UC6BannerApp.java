public class UC6BannerApp {

    public static void main(String[] args) {

        // Build banner using static helper methods
        String[] banner = {
                getTopLine(),
                getLetterLine('O'),
                getLetterLine('P'),
                getLetterLine('S'),
                getBottomLine()
        };

        // Loop-based rendering
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Top border
    public static String getTopLine() {
        return "###############";
    }

    // Bottom border
    public static String getBottomLine() {
        return "###############";
    }

    // Generates letter line dynamically
    public static String getLetterLine(char letter) {
        return "#      " + letter + "      #";
    }
}