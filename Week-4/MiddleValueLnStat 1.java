package assignments;

import java.util.Scanner;

public class MiddleValueLnStat {
	public static double mode(double[] arr) {
		int common = 0;
		int Mcount = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]==arr[i]) {
					count++;
				}
			}
			if (count > Mcount) {
				Mcount=count;
				common = (int) arr[i];
			}
		}
		if (Mcount == 1) {
			return Double.NaN;
		}
		else {
			return common;
		}
	}
	public static double middle(double[] arr) {
		if (arr.length%2==0) {
			double medium = arr[(arr.length/2)-1]+ arr[arr.length/2];
			return medium/2;
		}
		else {
			return arr[arr.length/2];
		}
	}

	public static double mean(double[] arr)
	{
		double sum = 0;
		for(double each: arr)
			sum += each;
		return sum/arr.length;
	}
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How many number(s)?: ");
	  
		int n = input.nextInt();
		double[] numlist = new double[n];
	  
		for (int i = 0; i < numlist.length; i++){
			System.out.print("Enter number#" +(i+1)+":");
			numlist[i] = input.nextDouble();
		}
		input.close();
		double mode = mode(numlist);
		System.out.printf("The Mean of these number(s) is %.2f%n",mean(numlist));
		System.out.printf("The Medium of these number(s) is %.2f%n",middle(numlist));
		if (Double.isNaN(mode)) {
			System.out.println("There is no mode.");
		}
		else {
			System.out.printf("The Mode of these number(s) is %.2f%n",mode(numlist));
		}
		
	}
}
		
 
