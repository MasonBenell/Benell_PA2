import java.util.Scanner;

public class Topic_Ratings 
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		final int NUM = 5;
		
		String[] topics = new String[NUM];
		int[][] responses = new int[5][10];
		double[] avg = new double[NUM];
		int[] div = new int[NUM];
		int i, j, rating;
		double  min, max;
		char cont = 'a';
		
		topics[0] = "Video Games";
		topics[1] = "YouTube";
		topics[2] = "Food";
		topics[3] = "Frisbee";
		topics[4] = "Basketball";
		
		while(cont != 'x')
		{
			for(i = 0; i < 5; i++)
			{
				System.out.print("Rate the topic " + topics[i] + " 1-10: ");
				rating = scnr.nextInt();
				
				responses[i][rating-1] = responses[i][rating-1] + 1;
				
				div[i] += 1;
			}
			
			
			System.out.print("Do you want to add a person?(y for yes, x for no): ");
			cont = scnr.next().charAt(0);
		}
		
		for(i = 0; i < 5; i++)
		{
			for(j = 0; j < 10; j++)
			{
				avg[i] += responses[i][j] * (j + 1);
			}
		}
		
		System.out.println();
		
		System.out.println("Topic         1   2   3   4   5   6   7   8   9   10   Avg_Rating");
		System.out.print(topics[0] + "   ");
		
		for(j = 0; j < 10; j++)
		{
			System.out.print(responses[0][j] + "   ");
		}
		System.out.println("     " + avg[0] / div[0]);
		
		
		
		System.out.print(topics[1] + "       ");
		
		for(j = 0; j < 10; j++)
		{
			System.out.print(responses[1][j] + "   ");
		}
		System.out.println("     " + avg[1] / div[1]);
		
		
		
		System.out.print(topics[2] + "          ");
		
		for(j = 0; j < 10; j++)
		{
			System.out.print(responses[2][j] + "   ");
		}
		System.out.println("     " + avg[2] / div[2]);
		
		
		
		System.out.print(topics[3] + "       ");
		
		for(j = 0; j < 10; j++)
		{
			System.out.print(responses[3][j] + "   ");
		}
		System.out.println("     " + avg[3] / div[3]);
		
		
		
		System.out.print(topics[4] + "    ");
		
		for(j = 0; j < 10; j++)
		{
			System.out.print(responses[4][j] + "   ");
		}
		System.out.println("     " + avg[4] / div[4]);
		
		
		min = avg[0];
		max = avg[0];
		
		for(i = 1; i < 5; i++)
		{
			if(avg[i] > max)
			{
				max = avg[i];
			}
			if(avg[i] < min)
			{
				min = avg[i];
			}
		}
		
		System.out.println();
		
		for(i = 0; i < 5; i++)
		{
			if(max == avg[i])
			{
				System.out.println("The issue with the highest point total was " + topics[i] + " with " + avg[i] + " points!");
			}
		}
		
		System.out.println();
		
		for(i = 0; i < 5; i++)
		{
			if(min == avg[i])
			{
				System.out.println("The issue with the lowest point total was " + topics[i] + " with " + avg[i] + " points!");
			}
		}
		
	}
}
