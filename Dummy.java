package week3.Day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Dummy {

	public static void main(String[] args) {
		
		
		Integer[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
        List<Integer> data=new ArrayList<Integer>(Arrays.asList(arr));
        Collections.sort(data);
        System.out.println(data);
        Set<Integer> set = new TreeSet<Integer>();
        for (Integer value : data) {
            if((data.indexOf(value))!=(data.lastIndexOf(value))) {
                set.add(value);
                //set.add(14, 14, 17, 17, 18, 18);
            }
               
        }
        	System.out.println(set);
	}

}
