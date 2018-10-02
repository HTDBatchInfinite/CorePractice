package com.core.string;

import java.util.Collections;
import java.util.TreeSet;

public class ArrayProgram {
	public static void main(String[] args) {
		int arr[] ={3,6,4,9,1};
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		for(int num:arr){
			treeset.add(num);
		}
		System.out.println("treeset::"+treeset);
		System.out.println("max val::"+treeset.last());
		System.out.println("max val::"+treeset.first());
		
	}
	
	
}
