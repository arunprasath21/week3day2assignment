package week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Findintersection {

	public static void main(String[] args) {
	
			     Integer [] arr1 = {3,2,11,4,7,6};
			    Integer [] arr2 = {1,2,8,4,9,7};
			   //List<Integer> intersect1= new ArrayList<Integer>(Arrays.asList(arr1));  //(Just for reference)
			   List<Integer> intersect1= new ArrayList<Integer>();
			   
			   intersect1.add(3);
			   intersect1.add(2);
			   intersect1.add(11);
			   intersect1.add(4);
			   intersect1.add(6);
			   intersect1.add(7);
			
			   System.out.println(intersect1);
			   
			   //List<Integer> intersect2 = new ArrayList<Integer>(Arrays.asList(arr2));  //(Just for reference)
			   List<Integer> intersect2 = new ArrayList<Integer>();
			   
			   intersect2.add(1);
			   intersect2.add(2);
			   intersect2.add(8);
			   intersect2.add(4);
			   intersect2.add(9);
			   intersect2.add(7);
			   
			   System.out.println(intersect2);
			  
			   //This method tried for the reference 
			  for( Integer firstset : intersect1) {       		
				   for (Integer secondset : intersect2) { 
					  if (firstset == secondset) {
					   System.out.println(firstset);	
			   		}
//					  (this is one type)
//					
//					  Set<Integer>set=new LinkedHashSet<Integer>();
//						for (Integer valuelst1 : lst1) {							
//							if((lst2.indexOf(valuelst1))>-1) {
//								set.add(valuelst1);
//							}
//							}
//							System.out.println(set);
//					 
//					  (this is one type for reference other method)
//					  
//				for (int i = 0; i < intersect1.size(); i++) {
//						for (int j = 0; j < intersect2.size(); j++) {
//				 
//				   	if (intersect1.get(i) == intersect2.get(j)) {
//					   System.out.println(intersect1.get(i));
//					   }
				   
						}
			   }
	}
}