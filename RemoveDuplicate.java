package week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
			String text = "We learn java basics as part of java sessions in java week1";	
			
			String[] split = text.split(" ");
			
			Set<String> set = new LinkedHashSet<String>();
			
			for (String eachtext : split) {
			
				set.add(eachtext);	
			}
			System.out.println(set);
		
		// This one is the set changed to method and tried for example 
			
			List<String> list = new ArrayList<String>(set);
			 
				System.out.println(list);
			 
			for (int i = 0; i < list.size(); i++) {
				
				String setToList = list.get(i); 
				
				 System.out.print(setToList);
			}	
	}
}
		