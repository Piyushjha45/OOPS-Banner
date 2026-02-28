public class UC5BannerApp {
    public static void main(String[] args) {
        
        // UC5: Combine array declaration and initialization in one statement
        // Using String.join() to make it concise
        String[] banner = {
            String.join("", "#####", "#####"), // Example pattern
            String.join("", "#", "         ", "#"),
            String.join("", "#", "  UC5  ", "#"),
            String.join("", "#", "         ", "#"),
            String.join("", "#####", "#####")
        };

        // UC5: Utilize an enhanced for loop to iterate through the array
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
