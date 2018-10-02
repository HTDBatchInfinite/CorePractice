package com.core.collections;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		WordCount count=new WordCount();
		String names="chandu is chandu is chandu the chandu";
		String array[]=names.split("\\s");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String name:array){
			if(map.containsKey(name)){
				map.put(name, map.get(name)+1);
			}
			else{
				map.put(name, 1);	
			}
		}
		System.out.println(map);
	}

}
