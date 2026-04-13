import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];

        // Mark letters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check all letters present
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                isPangram = false;
                break;
            }
        }

        if (isPangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");

        sc.close();
    }
}
