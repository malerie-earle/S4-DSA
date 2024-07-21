package Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageTemp {
    public double[] dailyTemp = new double[7]; // Array to store daily temperatures

    public void getDailyTemp() {
        Scanner input = new Scanner(System.in);

        // Reading temperatures for each day of the week
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            dailyTemp[i] = input.nextDouble();
        }
    }

    public double calculateAverage() {
        double sum = 0;

        // Summing up all temperatures
        for (int i = 0; i < dailyTemp.length; i++) {
            sum += dailyTemp[i];
        }

        // Calculating the average
        double average = sum / dailyTemp.length;
        return average;
    }

    public void overAverageDays(double average) {
        boolean found = false;
        for (int i = 0; i < dailyTemp.length; i++) {
            if (dailyTemp[i] > average) {
                System.out.println("Day " + (i + 1) + ": " + dailyTemp[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No days over average temperature.");
        }
    }

    public static void main(String[] args) {
        AverageTemp avgTemp = new AverageTemp();
        avgTemp.getDailyTemp();

        double averageTemperature = avgTemp.calculateAverage();
        DecimalFormat df = new DecimalFormat("##.##");
        String rounded = df.format(averageTemperature);

        System.out.println();
        System.out.println("Average temperature for the week: " + rounded);
        System.out.println();
        System.out.println("Days over the average:");
        avgTemp.overAverageDays(averageTemperature);
        System.out.println();
    }
}
