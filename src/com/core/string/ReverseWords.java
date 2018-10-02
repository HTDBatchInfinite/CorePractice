package com.core.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
	public static void main(String[] args) {
		String test=reverseWords("This is chandu");
		System.out.println("test::"+test);
	}

	private static String reverseWords(String sentance) {
		String [] arry=sentance.split("\\s");
		List<String> words=Arrays.asList(arry);
		Collections.reverse(words);
		 StringBuilder sb = new StringBuilder(sentance.length());
		 //original sentance
		/*for(int i=words.size()-1;i>=0;i--){
			sb.append(words.get(i));
			sb.append(' ');
		}*/
		//reverse sentence
		
		for(int i=0;i<=words.size()-1;i++){
			sb.append(words.get(i));
			sb.append(' ');
		}
		
		
		return sb.toString().trim();
	}

}
