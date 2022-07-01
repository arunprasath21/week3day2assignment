package week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		Integer [] data = {3,2,11,4,6,7};		
		List<Integer> largeNum = new ArrayList<Integer>(Arrays.asList(data));	
			Collections.sort(largeNum);
			
			System.out.println(largeNum);
			
			//System.out.println(largeNum.size());  (for understanding)
			
			int value = largeNum.get(largeNum.size()-2);
		
			System.out.println(value);
		}
}	


