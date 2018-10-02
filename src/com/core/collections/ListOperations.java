package com.core.collections;



import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListOperations {
	public static void main(String[] args) throws Exception {
		List<String> arryList=new ArrayList<String>();
		setData(arryList);
		//fail-fast Iterator Concept
		arryList=updateName("siva","prasad",arryList);
		List<String> copylist=new CopyOnWriteArrayList<String>();
		setData(copylist);
		//fails-safe
		copylist=updateName("siva","prasad",arryList);
		System.out.println("copylist::"+copylist.toString());
		
	}

	private static List<String>  updateName(String originalName, String updatedName, List<String> list) throws Exception {
		try{
		for(String names:list){
		if(names.equalsIgnoreCase(originalName)){
			list.remove(originalName);
			list.add(updatedName);
		}
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(list.toString());
		return list;
	}

	private static void setData(List<String> list) {
		list.add("chandu");
		list.add("siva");
		list.add("phani");
		list.add("ajay");
		list.add("naidu");
	}

}
