package week3.Day2.Assignment;

import java.util.HashMap;
import java.util.Map;

public class FirstMostDupliacate {
	public static void main(String[] args) {
	String input="abbaba";
	int count =0;
	char value = 0
			
			;
		Map <Character,Integer> mapinput= new HashMap<Character,Integer>();
		char[] input1 = input.toCharArray();
		
			for (int i = 0; i < input1.length; i++) {
				mapinput.put(input1[i], mapinput.getOrDefault(input1[i], 0)+1);
				if(mapinput.get(input1[i])>count) {
					 value = input1[i];
					count = mapinput.get(input1[i]);
			}
		}
			System.out.println(value);
			System.out.println(count);
	}
}		



