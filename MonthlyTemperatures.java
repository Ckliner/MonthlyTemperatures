import java.util.Scanner;

public class MonthlyTemperatures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        double[] temperatures = {
            21.9, 28.5, 38.3, 45.5, 61.3, 66.7,
            72.4, 72.7, 63.3, 52.4, 43.3, 32.0
        };
        
        System.out.println("Buffalo, NY. 2022 Temperatures");
        System.out.println("Choose an Option:");
        System.out.println("Option 1. View monthly temperature");
        System.out.println("Option 2. View yearly statistics");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter month (1-12) to view: ");
            int monthChoice = scanner.nextInt();

            if (monthChoice >= 1 && monthChoice <= 12) {
                int index = monthChoice - 1;
                System.out.println("Month: " + months[index]);
                System.out.println("Average Temperature: " + temperatures[index] + " degrees");
            } else {
                System.out.println("Invalid month choice.");
            }
        } else if (choice == 2) {
            double yearlySum = 0;
            double highestMonthlyAverage = Double.MIN_VALUE;
            double lowestMonthlyAverage = Double.MAX_VALUE;

            for (int i = 0; i < 12; i++) {
                yearlySum += temperatures[i];
                if (temperatures[i] > highestMonthlyAverage) {
                    highestMonthlyAverage = temperatures[i];
                }
                if (temperatures[i] < lowestMonthlyAverage) {
                    lowestMonthlyAverage = temperatures[i];
                }
            }

            double yearlyAverage = yearlySum / 12;

            System.out.println("Yearly Average Temperature: " + yearlyAverage + " degrees");
            System.out.println("Highest Monthly Average: " + highestMonthlyAverage + " degrees");
            System.out.println("Lowest Monthly Average: " + lowestMonthlyAverage + " degrees");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
