import java.util.Scanner;

public class DoubleArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        double[] arr = new double[n];
        double sum = 0;

        // Input
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        // Display
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Average
        double avg = sum / n;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
