package javaChallenge;

import java.util.ArrayList;
import java.util.List;

public class SingleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {4,1,2,1,2};
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> dup=new ArrayList<Integer>();
		
		for(int i =0;i<nums.length;i++)
		{
			list.add(nums[i]);
			for(int j=i+1;j<nums.length;j++)
			{
				
				
					if(nums[i]== nums[j])
					{
						dup.add(nums[i]);
					}
					
			}
		}
		
	
		for(int i=0;i<list.size();i++)
		{
			list.removeAll(dup);
		}
	System.out.println(list);
	}

}
