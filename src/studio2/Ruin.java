package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	
		System.out.println("What would you like your starting amount to be?");
		double startAmount = in.nextDouble();
		System.out.println("What would you like your win chance to be?");
		double winChance = in.nextDouble();
		System.out.println("What would you like your win limit to be?");
		double winLimit = in.nextDouble();
		int totalDailyStimulations = 0;
		System.out.println("How many days would you like to play?");
		int maxDays = in.nextInt();
		int day = 0;
		int ruin = 0;
		int win = 0;
	
	while (day<maxDays)
	{
		double money = startAmount;
		while (money<winLimit && money>0)
		{
			double value =(Math.random());
				
			if (value<=winChance)
			{
				money++;
	
			}
			else
				money--;
				
		}
				
			if (money<=0)
			{
				System.out.println("On day " + day + ": Ruin");
				ruin++;
			}
			else 
			{
				System.out.println("On day " + day + ": Win");
				win++;
			}
			day++;
	}
	double a = (1-winChance)/winChance;
	if (winChance == 0.5)
	{
	 	double expectedRuin = (1 - (startAmount/winLimit));
	}
	 else
		 (a)
	 		
	
	System.out.println("stimulation is done");	
	System.out.println("The total number of stimulations was: " + day);
	System.out.println("The total number of ruins was: " + ruin);
	System.out.println("The total number of wins was: " + win);

			
			
			

}}
