package assignments;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight(in kg):  ");
		String a = input.nextLine();
		System.out.println("Enter height(in cm): ");
		String b = input.nextLine();
		if (a.substring(a.length()-2).equals("kg")){
			Integer stringToInteger = Integer.valueOf(a.substring(0,2));
			int w = stringToInteger.intValue();
			if (b.substring(b.length()-2).equals("cm")){
				float h = (Float.parseFloat(b.substring(0,b.length()-2))/100);
				double BMI = w/(h*h);
				System.out.println("BMI value of this person is: " + String.format("%.2f", BMI)+" kg/m^2.");
				if (BMI<18.5) {
					System.out.print("Underweight");
				}
				if ((BMI >= 18.5) && (BMI < 25)){
					System.out.print("Normal");
				}
				if ((BMI >=25)&&(BMI<30)) {
					System.out.print("Overweight");
				}
				if (BMI >= 30) {
					System.out.print("Obese");
				}
			}
		}
		else {
			System.out.println("Error!!You need to input units value too");
			System.out.println("Check units!! Unit must be kg and cm.");
		}
		input.close();
	}

}
