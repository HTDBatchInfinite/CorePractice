package com.core.arrays;

public class FirstAndSecondLargest {
	public static void main(String[] args) {
		int nums[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
		int max=0;
		int min=0;
		for(int  i=0;i<nums.length;i++){
			if(max<nums[i]){
				min=max;	
				max=nums[i];
			}
			else if(min<nums[i]){
				min=nums[i];
			}
		}
		System.out.println("first highest salry:"+max);
		System.out.println("second highest salry:"+min);
	}
	

}
