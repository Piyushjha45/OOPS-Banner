public class HelloApp {
    public static void main(String[] args) {
        
        // Check if user has provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("Hello! Please provide your name as a command-line argument.");
        }
    }
}
