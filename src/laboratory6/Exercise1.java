package laboratory6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Exercise1 {
	
	public static List <Integer> getValues(HashMap <String, Integer> hash) {
		
		List<Integer> list = new ArrayList<Integer> ();
		for(Integer i: hash.values()) {
			list.add(i);
		}
		Collections.sort(list);
		return(list);
	
	}

	
	public static void main(String[] args) {
		
	HashMap <String , Integer> ExampleMap = new HashMap<>();
	
	ExampleMap.put("Shweta", 52);
	ExampleMap.put("Asthaa", 73);
	ExampleMap.put("Vaishanavi", 63);
	ExampleMap.put("Hadeeqa", 58);
	ExampleMap.put("Nisha", 48);
	
	List<Integer> sortedList = Exercise1.getValues(ExampleMap);
	Iterator<Integer> i = sortedList.iterator();
	System.out.println("Sorted Values are : ");
	while(i.hasNext())
	{
		System.out.println(" " + i.next());
	}
	
}
}
