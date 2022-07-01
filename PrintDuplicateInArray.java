package week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		
		Integer [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer> listarr = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(listarr);
		System.out.println(listarr);
		System.out.println("-----------------------------------------");
		System.out.println(listarr.size());
		System.out.println("------------------------------------------");
		int count;
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i=0;i<listarr.size()+1;i++) {
			// assign 0 to count 
			count = 0;
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int j=i;j<listarr.size()-1;j++) {
				// compare both the loop variables & check they're equal
				if (listarr.get(i)==listarr.get(j)){
				// increase the count if both the arrays are equal
				count++;
				}
			}
				if(count>1) {
				System.out.println(listarr.get(i));
				}
		
		}
	}
}	