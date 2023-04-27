


import java.util.Random;

public class Arrayed {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        System.out.print("Data Points: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
    }
}


