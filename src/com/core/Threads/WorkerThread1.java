package com.core.Threads;
/*package com.core.Threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerThread implements Runnable{
	public WorkerThread(String patid, List<Map<String, String>> list,
			List<Map<String, String>> consoleList) {
		super();
		this.patid = patid;
		this.list = list;
		this.consoleList = consoleList;
	}

	private String patid;
	List<Map<String,String>> list;
	List<Map<String,String>> consoleList;
	@Override
	public void run() {
		 long starttime=System.currentTimeMillis();
		System.out.println("Thread ::" + patid + " is started");
		List<Map<String,String>> mapList = getMapsbyPatid(patid, list);
		Map<String,String> consoilMap=getConsolidMap(mapList);
		consoleList.add(consoilMap);
		long endtime=System.currentTimeMillis();
		long timediff=endtime-starttime;
        System.out.println("time diffrence :"+timediff+" "+patid);
        System.out.println("Thread ::"+patid+" is ended");
		
		
	}
	private static Map<String,String> getConsolidMap(List<Map<String, String>> mapList) {
		Map<String,String> consoilMap=new HashMap<String,String>();
		String formStatus=getFormStatus(mapList);
		for(Map<String, String> map:mapList){
			for(Map.Entry<String, String> mapEntry:map.entrySet()){
				consoilMap.put(mapEntry.getKey(), mapEntry.getValue());
			}
			break;
		}
		
		consoilMap.put("FORMStatus", formStatus);
		return consoilMap;
	}



	private static String getFormStatus(List<Map<String, String>> mapList) {
		String status=null;
		for(Map<String, String> map :mapList){
			if(null!=status && null!= map.get("FORMStatus")){
				status=status+","+map.get("FORMStatus");
			}
			else{
				status=map.get("FORMStatus");
			}
			
		}
		return status;
		
	}



	private static List<Map<String,String>> getMapsbyPatid(String patid, List<Map<String, String>> list) {
		List<Map<String,String>> mapList=new ArrayList<Map<String,String>>();
		for(Map<String,String> map:list){
			if(map.containsValue(patid)){
				mapList.add(map);
			}
		}
		return mapList;
		
	}
	


}
*/