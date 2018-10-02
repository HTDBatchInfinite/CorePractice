package com.core.NumberSeries;

public class PrimeNumberDemo {
	public static void main(String[] args) {
		int totalPrimeCount=0;
		int totalNonPrimeCount=0;
		for(int i=1;i<=100;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count=count+1;
				}
			}
			if(count==2){
				System.out.println("prime numbers:"+i);
				totalPrimeCount=totalPrimeCount+1;
				if(totalPrimeCount==10){
					break;
				}
				
			}
			/*else{
				//System.out.println("non prime numbers:"+i);
				totalNonPrimeCount=totalNonPrimeCount+1;
				if(totalNonPrimeCount==10){
					break;
				}
			}*/
		}
	}

}
