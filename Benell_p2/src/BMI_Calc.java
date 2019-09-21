import java.util.Scanner;

public class BMI_Calc
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int select, weight, height;
		double bmi = 0;
		
		System.out.printf("For metric systems enter 1, for SI enter 0: ");
		select = scnr.nextInt();
		
		if(select == 1)
		{
			System.out.printf("\nEnter weight in kilograms: ");
			weight = scnr.nextInt();
			
			System.out.printf("\nEnter height in meters: ");
			height = scnr.nextInt();
			
			bmi = weight / Math.pow(height, 2);
		}
		
		if(select == 0)
		{
			System.out.printf("\nEnter weight in pounds: ");
			weight = scnr.nextInt();
			
			System.out.printf("\nEnter height in inches: ");
			height = scnr.nextInt();
			
			bmi = 703 * weight / Math.pow(height, 2);
			
			System.out.println();
		}
		
		System.out.println("BMI: " + bmi);
		
		System.out.printf("\nUnderweight = <18.5\nNormal weight = 18.5-24.9\nOverweight = 25-29.9\nObesity = BMI of 30 or greater\n");	
	}
	
	
}
