import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        int sum = 0;
        double average = 0;
        int timesFound = 0;
        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for(int i : dataPoints)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        for(int i : dataPoints)
        {
            sum += i;
        }

        average = sum / dataPoints.length;
        System.out.println("\nThe sum of the numbers is " + sum + ", and the average is " + average);


        int value = SafeInput.getRangedInt(in,"Enter a value between ", 1, 100);
        for(int i : dataPoints)
        {
            if(dataPoints[i] == value)
            {
                timesFound ++;
            }
        }
        System.out.println("Your number occurs " + timesFound + " time[s]. ");

        int valueTwo = SafeInput.getRangedInt(in,"Enter a value between ", 1, 100);
        for(int i : dataPoints)
        {
            if(dataPoints[i] == valueTwo)
            {
                System.out.println("The value " + valueTwo + " was found at position " + i + ".");
                break;
            }
        }

        int minimum = dataPoints[0];
        int maximum = dataPoints[99];
        for(int i : dataPoints)
        {
            if(i > maximum)
            {
                maximum = i;
            }
            if(i < minimum)
            {
                minimum = i;
            }
        }
        System.out.println("The minimum is " + minimum + ", and the maximum is " + maximum + ". ");
        System.out.println("The average value is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int sum = 0;
        double average = 0;
        for (int i : values)
        {
            sum += i;
        }
        average = (double) sum / values.length;
        return average;
    }
}