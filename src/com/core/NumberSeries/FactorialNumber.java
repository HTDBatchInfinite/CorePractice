package com.core.NumberSeries;

public class FactorialNumber {
	public static void main(String[] args) {
		int factSum=findFactorial(4);
		int factSumWithRec=findFactUseRecursion(4);
		System.out.println("factSum::"+factSum);
		System.out.println("factSumWithRec::"+factSumWithRec);
	}

	private static int findFactUseRecursion(int num) {
		if(num==1){
			return num;
		}
		return num*(findFactUseRecursion(num-1));
	}

	private static int findFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		
	   return  fact;
	}

}
