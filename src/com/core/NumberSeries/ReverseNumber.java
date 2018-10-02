package com.core.NumberSeries;

public class ReverseNumber {
	public static void main(String[] args) {
		int reverseNum=numberRevWithOutRec(678);
		//System.out.println("reverseNum::"+reverseNum);
		numRevWithRecursion(845);
	}

	private static void numRevWithRecursion(int number) {
	if(number<10){
			System.out.print(number);
			return ;
		}
	else{
	System.out.print(number%10);
	number=number/10;
	numRevWithRecursion(number);
		}
	}

	private static int numberRevWithOutRec(int num) {
		int reverseNum=0;
		while(num>0){
			reverseNum=reverseNum*10;
			reverseNum=reverseNum+num%10;
			num=num/10;
		}
		return reverseNum;
	}

}
