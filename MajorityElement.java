package javaChallenge;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		int count=0,index=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] nums=new int[n];

		System.out.println("Enter the numbers in the array");
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(nums[i]==nums[j])
					count++;	
			}
			if (count > (n/2)) {
				index=i;				
			}


		}
		if(count>1)
		{
			
		System.out.println("Count " +count);
			System.out.println("The Majority Element is " + nums[index]);
		}
		else
			System.out.println("No Majority Element");
	}



}


