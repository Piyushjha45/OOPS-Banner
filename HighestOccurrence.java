import java.util.Scanner;

public class HighestOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int max = 0;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && str.charAt(i) != ' ') {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                result = str.charAt(i);
            }
        }

        System.out.println("Highest occurring character: " + result);
        System.out.println("Frequency: " + max);

        sc.close();
    }
}
