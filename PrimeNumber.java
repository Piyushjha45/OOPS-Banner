import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num, count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Check prime
        if (num <= 1) {
            System.out.println(num + " is not a Prime number.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2)
                System.out.println(num + " is a Prime number.");
            else
                System.out.println(num + " is not a Prime number.");
        }

        sc.close();
    }
}
