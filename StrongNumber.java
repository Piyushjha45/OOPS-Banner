import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        int num, originalNum, remainder, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNum = num;

        // Calculate sum of factorials of digits
        while (num != 0) {
            remainder = num % 10;

            int fact = 1;
            for (int i = 1; i <= remainder; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        // Check Strong number
        if (sum == originalNum)
            System.out.println(originalNum + " is a Strong number.");
        else
            System.out.println(originalNum + " is not a Strong number.");

        sc.close();
    }
}