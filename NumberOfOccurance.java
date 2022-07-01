package week3.Day2.Assignment;

import java.util.Map;
import java.util.TreeMap;

public class NumberOfOccurance {

	public static void main(String[] args) {
	
		Integer [] data = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> mapData = new TreeMap <Integer,Integer> ();
		
		for (int i = 0; i < data.length; i++) {
			if(mapData.containsKey(data[i])) {
				//System.out.println(data[i]);    (for reference to check)
				mapData.put(data[i], mapData.get(data[i])+1);
			}
			else{
					mapData.put(data[i], 1);
			}
		}
		System.out.println(mapData);
		
//	 Set<Entry<Integer, Integer>> entrySet = mapData.entrySet();		( just for reference in future set)
//	 System.out.println(entrySet);
//		for (Entry<Integer, Integer> entry : entrySet) {
//			System.out.print(entry.getKey()+"-->"+entry.getValue()+" , ");		
//		}	
	}
}	
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		