package assigment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Classexe7 {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number of real numbers (enter 0 to stop):");
        double number = input.nextDouble();
        for(int i = 0; number != 0; i++) {
            numbers.add(number);
            number = input.nextDouble();
        }
        Collections.sort(numbers);
        input.close();
        int numElements = numbers.size();
        double highest = numbers.get(numElements - 1);
        double lowest = numbers.get(0);
        double sum = 0;
        for (int j = 0; j < numbers.size(); j++) {
            sum += numbers.get(j);
        }
        double average = sum / numElements;
        
        System.out.println("Sorted List:"+ numbers + ".");
        System.out.println("Number of elements: " + numElements);
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
        System.out.println("Average: " + average);
    }
}
