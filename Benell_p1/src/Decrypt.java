import java.util.Scanner;

public class Decrypt
{
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int userInt, int1, int2, int3, int4, intde1, intde2, intde3, intde4, intswap;
		
		System.out.print("Enter 4 digit encrypted code: ");
		userInt = scnr.nextInt();
		
		int1 = userInt / 1000;
		
		int2 = (userInt / 100) - (int1 * 10);
		
		int3 = (userInt / 10) - (int1 * 100) - (int2 * 10);
		
		int4 = userInt - (int1 * 1000) - (int2 * 100) - (int3 * 10);
		
		
		intswap = int1;
		intde1 = int3;
		intde3 = intswap;
		
		intswap = int2;
		intde2 = int4;
		intde4 = intswap;
		
		
		if(intde1 >= 7)
		{
			intde1 = (intde1 - 7);
		}
		else
		{
			intde1 = (intde1 + 3);
		}
		
		if(intde2 >= 7)
		{
			intde2 = (intde2 - 7);
		}
		else
		{
			intde2 = (intde2 + 3);
		}
		
		if(intde3 >= 7)
		{
			intde3 = (intde3 - 7);
		}
		else
		{
			intde3 = (intde3 + 3);
		}
		
		if(intde4 >= 7)
		{
			intde4 = (intde4 - 7);
		}
		else
		{
			intde4 = (intde4 + 3);
		}
		
		
		System.out.println("Decrypted Integer: " + intde1 + "" + intde2 + "" + intde3 + "" + intde4);
		
		
	}
	
}
