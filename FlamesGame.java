import java.util.Scanner;

public class FlamesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String name1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine().toLowerCase().replace(" ", "");

        // Remove common characters
        StringBuilder sb1 = new StringBuilder(name1);
        StringBuilder sb2 = new StringBuilder(name2);

        for (int i = 0; i < sb1.length(); i++) {
            for (int j = 0; j < sb2.length(); j++) {
                if (sb1.charAt(i) == sb2.charAt(j)) {
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }

        int count = sb1.length() + sb2.length();

        String flames = "FLAMES";
        int index = 0;

        // Eliminate letters
        while (flames.length() > 1) {
            index = (index + count - 1) % flames.length();
            flames = flames.substring(0, index) + flames.substring(index + 1);
        }

        // Result
        char result = flames.charAt(0);

        switch (result) {
            case 'F': System.out.println("Friends"); break;
            case 'L': System.out.println("Love"); break;
            case 'A': System.out.println("Affection"); break;
            case 'M': System.out.println("Marriage"); break;
            case 'E': System.out.println("Enemy"); break;
            case 'S': System.out.println("Siblings"); break;
        }

        sc.close();
    }
}
