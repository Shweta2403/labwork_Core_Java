package laboratory6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise2 {
	
	public static HashMap<Character, Integer> countChars (char[] arr) {
		
		HashMap<Character, Integer> ansMap = new HashMap<Character, Integer> ();
		for (char c: arr) {
			if (ansMap.containsKey(c))
				ansMap.put(c, ansMap.get(c)+1);
			else
				ansMap.put(c,  1);			
		}
		
		return ansMap;
	}	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		char arr[] = new char[10];
		for(int i =0; i<10; i++)
			arr[i] = sc.next().charAt(0);
		HashMap<Character, Integer> ansMap = countChars(arr);
		for (Entry<Character, Integer> entry : ansMap.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + " " + val);
		}
		
		
	}

}