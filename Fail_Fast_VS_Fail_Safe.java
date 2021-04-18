package tidbits;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Fail_Fast_VS_Fail_Safe {

	public static void main(String[] args) {
	
		Map<Integer, String> failFastMap = new HashMap<>(); // fail-safe
			failFastMap.put(10,"GOOGLE");
			failFastMap.put(20,"YAHOO");
			failFastMap.put(30,"REDIFF");
		
		for(Integer key : failFastMap.keySet()) {
			failFastMap.remove(10);
		}
		System.out.println(failFastMap);	
		
		Map <Integer, String> failSafeMap = new ConcurrentHashMap<>(); // fail-fast Implementation
		failSafeMap.put(1,"IBM");
		failSafeMap.put(2,"ORACLE");
		failSafeMap.put(3,"KROSUMLABS");
		

		for(Integer key : failSafeMap.keySet()) {
			failSafeMap.remove(3);System.out.println(failSafeMap);
		}
	
			

	}

}
