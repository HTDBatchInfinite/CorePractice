package com.core.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateFind {
	public static void main(String[] args) {
		String array[]= {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		//findDuplicate(array);
		//reverseOrder(array);
		findDuplicateUseMap(array);
		//Arrays.
		
	}

	private static void findDuplicateUseMap(String[] array) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String val:array){
			if(map.containsKey(val)){
				map.put(val, map.get(val)+1);
			}
			else{
				map.put(val, 1);
			}
		}
		System.out.println("map::"+map);
		
	}

	private static void reverseOrder(String[] array) {
		for(int i=array.length-1;i>=0;i--){
			System.out.println(array[i]);
		}
		
	}

	private static void findDuplicate(String[] array) {
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i].equals(array[j]) && i!=j){
					System.out.println("duplicate elements::"+array[j]);
				}
			}
		}
		
	}

}
