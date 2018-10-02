import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class TestDemo {
	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		System.out.println("starttime::"+starttime);
		List<Map<String,String>> list=setData();
		List<String> uniqPatList=getUniquePatid(list);
		System.out.println("uniqPatList::"+uniqPatList);
		List<Map<String,String>> consoleList=new ArrayList<Map<String,String>>();
		for(String patid:uniqPatList){
			List<Map<String,String>> mapList=getMapsbyPatid(patid,list);
			Map<String,String> consoilMap=getConsolidMap(mapList);
			consoleList.add(consoilMap);
		}
		System.out.println("consoleList::"+consoleList);
		long stoptime=System.currentTimeMillis();
		System.out.println("stoptime::"+stoptime);
        long timediff=stoptime-starttime;
        System.out.println("timediff::"+timediff);
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



	private static List<String>  getUniquePatid(List<Map<String, String>> list) {
		List<String> uniqpatList=new ArrayList<String>();
		for(Map<String, String> map :list){
			String patid=map.get("PATID");
			if(uniqpatList.indexOf(patid)<0){
				uniqpatList.add(patid);
			}
		}
		return uniqpatList;
	}




private static List<Map<String,String>> setData() {
		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
		Map<String,String> map=new HashMap<String,String>();
		map.put("PATID", "DEM011001");
		map.put("FORM", "DO1");
		map.put("FORMStatus", "4");
		map.put("PKEY", "DEM011001");
		map.put("TRIGZZID", "1");
		list.add(map);
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("PATID", "DEM011001");
		map1.put("FORM", "DO2");
		map1.put("FORMStatus", "3");
		map1.put("PKEY", "DEM011001");
		map1.put("TRIGZZID", "1");
		list.add(map1);
		
		Map<String,String> ma5=new HashMap<String,String>();
		ma5.put("PATID", "DEM011001");
		ma5.put("FORM", "DO4");
		ma5.put("FORMStatus", "3");
		ma5.put("PKEY", "DEM011001");
		ma5.put("TRIGZZID", "1");
		list.add(ma5);
		
		Map<String,String> map3=new HashMap<String,String>();
		map3.put("PATID", "DEM011002");
		map3.put("FORM", "DO3");
		map3.put("FORMStatus", "2");
		map3.put("PKEY", "DEM011002");
		map3.put("TRIGZZID", "1");
		list.add(map3);
		
		Map<String,String> map4=new HashMap<String,String>();
		map4.put("PATID", "DEM011002");
		map4.put("FORM", "DO3");
		map4.put("FORMStatus", "6");
		map4.put("PKEY", "DEM011002");
		map4.put("TRIGZZID", "1");
		list.add(map4);
		
		Map<String,String> map6=new HashMap<String,String>();
		map6.put("PATID", "DEM011003");
		map6.put("FORM", "DO3");
		map6.put("FORMStatus", "2");
		map6.put("PKEY", "DEM011003");
		map6.put("TRIGZZID", "1");
		list.add(map6);
		Map<String,String> map7=new HashMap<String,String>();
		map7.put("PATID", "DEM011004");
		map7.put("FORM", "DO6");
		map7.put("FORMStatus", "6");
		map7.put("PKEY", "DEM011004");
		map7.put("TRIGZZID", "1");
		list.add(map7);
		Map<String,String> map8=new HashMap<String,String>();
		map8.put("PATID", "DEM011005");
		map8.put("FORM", "DO7");
		map8.put("FORMStatus", "5");
		map8.put("PKEY", "DEM011005");
		map8.put("TRIGZZID", "1");
		list.add(map8);
		Map<String,String> map9=new HashMap<String,String>();
		map9.put("PATID", "DEM011005");
		map9.put("FORM", "DO8");
		map9.put("FORMStatus", "3");
		map9.put("PKEY", "DEM011005");
		map9.put("TRIGZZID", "1");
		list.add(map9);
		Map<String,String> map10=new HashMap<String,String>();
		map10.put("PATID", "DEM011006");
		map10.put("FORM", "DO9");
		map10.put("FORMStatus", "6");
		map10.put("PKEY", "DEM011006");
		map10.put("TRIGZZID", "1");
		list.add(map10);
		Map<String,String> map11=new HashMap<String,String>();
		map11.put("PATID", "DEM011006");
		map11.put("FORM", "DO10");
		map11.put("FORMStatus", "3");
		map11.put("PKEY", "DEM011006");
		map11.put("TRIGZZID", "1");
		list.add(map11);
		return list;
	}
}