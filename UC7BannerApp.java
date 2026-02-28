public class UC7BannerApp {

    // 1. Static Inner Class to encapsulate character data
    static class CharacterPattern {
        private char character;
        private String[] asciiArt;

        // Constructor
        public CharacterPattern(char character, String[] asciiArt) {
            this.character = character;
            this.asciiArt = asciiArt;
        }

        // Getters
        public char getCharacter() {
            return character;
        }

        public String[] getAsciiArt() {
            return asciiArt;
        }
    }

    // 2. Data Structure to store mappings (Centralized Management)
    private static final CharacterPattern[] bannerLibrary = {
        new CharacterPattern('O', new String[]{
            " $$$ ",
            "$   $",
            "$   $",
            " $$$ "
        }),
        new CharacterPattern('P', new String[]{
            "$$$$ ",
            "$   $",
            "$$$$ ",
            "$    "
        }),
        new CharacterPattern('S', new String[]{
            " $$$ ",
            "$    ",
            " $$$ ",
            "    $"
        })
    };

    // 3. Method to retrieve pattern based on character
    public static String[] getPatternForChar(char c) {
        for (CharacterPattern cp : bannerLibrary) {
            if (cp.getCharacter() == c) {
                return cp.getAsciiArt();
            }
        }
        return new String[]{"     ", "     ", "     ", "     "}; // Default if not found
    }

    public static void main(String[] args) {
        String wordToDisplay = "OOPS";
        displayBanner(wordToDisplay);
    }

    public static void displayBanner(String word) {
        // Utilizing StringBuilder for efficient string concatenation
        for (int i = 0; i < 4; i++) { // Assuming ASCII art height is 4
            StringBuilder row = new StringBuilder();
            for (char c : word.toCharArray()) {
                row.append(getPatternForChar(c)[i]).append("  ");
            }
            System.out.println(row.toString());
        }
    }
}