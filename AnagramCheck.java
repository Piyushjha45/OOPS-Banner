import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Convert to char arrays
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        // Sort arrays
        Arrays.sort(a1);
        Arrays.sort(a2);

        // Compare
        if (Arrays.equals(a1, a2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}
