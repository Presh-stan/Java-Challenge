package javaChallenge;

public class HappyNumber {

	public static int checkHN (int num)
	{
		int reminder = 0, sum = 0;
		while(num > 0)
		{
			reminder = num %10;
			sum = sum+(reminder*reminder);
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args) {

		int number =19;
		int n=number;
		while (number != 1 && number != 4)
		{
			number = checkHN(number);
		}
		if (number ==1)
		{
			System.out.println (n + " is a Happy Number");
		}
		else
		{
			System.out.println (n+ "  is not a Happy Number");
		}
	}


}
