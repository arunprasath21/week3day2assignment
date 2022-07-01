package week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {
	public static void main(String[] args) {
		
	
	// Here is the input
			Integer[] arr = {1,2,3,4,7,6,8};

			// Sort the array	
	List<Integer> listarr = new ArrayList<Integer>(Arrays.asList(arr));
	
				Collections.sort(listarr);
				System.out.println(listarr);
				
					for (int i = 1; i <= listarr.size(); i++) {		//(This is the collections method)
						if(i!= listarr.get(i-1)) {
						System.out.println(i);
						break;
						}
					}
					//for (int i=1 ; i<=arr.length;i++) {	(This is the array method for reference)
						//if(i!=arr[i-1]) {
							//System.out.println(i);
							//break;
						//}
				//}
	}
}	
					