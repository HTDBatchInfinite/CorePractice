package com.core.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class ArrayListToLinkedList {
	public static void main(String[] args) {
		List<String> arrayList=Arrays.asList("chnadu","chari","prasad");
		List<String> linkedList=convertToLinkedList(arrayList);
		System.out.println(linkedList);
	}

	private static  List<String> convertToLinkedList(List<String> arrayList) {
		List<String> linkedList=new LinkedList<String>();
		for(String str:arrayList){
			linkedList.add(str);
		}
		return linkedList;
		
	}

}
