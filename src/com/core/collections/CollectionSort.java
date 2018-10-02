package com.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("ajay");
		list.add("suresh");
		list.add("prasad");
		list.add("venki");
		Collections.sort(list);
		System.out.println("ascending order:"+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("descending order:"+list);
	}
	

}

