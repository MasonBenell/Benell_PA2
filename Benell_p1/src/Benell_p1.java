import java.util.Scanner;


public class Benell_p1
{

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int userInt, int1, int2, int3, int4, intde1, intde2, intde3, intde4, intswap;
		
		System.out.print("Enter 4 digit code: ");
		userInt = scnr.nextInt();
		
		int1 = userInt / 1000;
		
		int2 = (userInt / 100) - (int1 * 10);
		
		int3 = (userInt / 10) - (int1 * 100) - (int2 * 10);
		
		int4 = userInt - (int1 * 1000) - (int2 * 100) - (int3 * 10);
		
		
		intde1 = (int1 + 7)%10;
		
		intde2 = (int2 + 7)%10;
		
		intde3 = (int3 + 7)%10;
		
		intde4 = (int4 + 7)%10;
		
		
		intswap = intde1;
		intde1 = intde3;
		intde3 = intswap;
		
		intswap = intde2;
		intde2 = intde4;
		intde4 = intswap;
		
		
		
		
		//System.out.println("Encrypted Code: " + int1 + " " + int2 + " " + int3 + " " + int4);
		
		System.out.println("Encrypted Integer: " + intde1 + "" + intde2 + "" + intde3 + "" + intde4);
		
		
	}

}
