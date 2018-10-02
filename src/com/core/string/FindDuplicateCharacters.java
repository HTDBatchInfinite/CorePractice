package com.core.string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		printDuplicateCharacters("aabbbcdedf");
		
	}

	private static void printDuplicateCharacters(String word) {
		
		char [] characters = word.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character ch :characters){
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}
			else{
				map.put(ch,1);
			}
			
		}
		for(Map.Entry<Character,Integer> entry :map.entrySet()){
			 System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
		}
	}

}
