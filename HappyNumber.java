import java.util.Scanner;

public class HappyNumber {

    // Function to find sum of squares of digits
    static int sumOfSquares(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int result = num;

        // Repeat until 1 or 4 (4 means loop)
        while (result != 1 && result != 4) {
            result = sumOfSquares(result);
        }

        if (result == 1)
            System.out.println(num + " is a Happy number.");
        else
            System.out.println(num + " is not a Happy number.");

        sc.close();
    }
}
