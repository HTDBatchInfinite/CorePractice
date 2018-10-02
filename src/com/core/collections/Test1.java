package com.core.collections;

public class Test1 {
	public static void main(String[] args) {
		
		
		int key = 2;
		int[] arry = { 1, 2, 3, 4, 5 };
		int val = 0;
		int[] result = new int[5];
		int counter = 1;
		for (int i = 0; i < arry.length; i++) {
			for (int k = 1; k <= key; k++) {
				System.out.println(arry[counter]);
				val = val + arry[k];
				// System.out.println("val::"+val);
				counter = counter + 1;

			}
			result[i] = val;
			System.out.println(result.toString());

		}
		for (int res : result) {
			System.out.println("res:" + res);
		}
	}

}
