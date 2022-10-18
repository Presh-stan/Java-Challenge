package javaChallenge;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=16;
		double temp;
		double sqrt=number/2;
		do
		{
			temp=sqrt;
			sqrt=(temp+(number/temp))/2;
			
		}while((temp-sqrt)!=0);
		
		int squareRoot =(int) Math.abs(sqrt);
		System.out.println("Square root of "+ number + " is " +squareRoot);
	}

}
