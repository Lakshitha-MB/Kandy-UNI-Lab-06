import java.util.Scanner;

public class IT26101497Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0;
        int count = 0;
        int number;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            } else if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumOfSquares += (double) number * number;
            count++;
        }

        double rms = 0;
        if (count > 0) {
            rms = Math.sqrt(sumOfSquares / count);
        }

        System.out.println();
        System.out.println("The Root Mean Square (RMS) is: " + rms);

        input.close();
    }
}