package examples;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < 20; i++) {
			hashMap.put("Item" +i, i);
		}

		System.out.println("HashMap:" + hashMap);
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		for (int i = 0; i < 20; i++) {
			treeMap.put("Item" +i, i);
		}

		System.out.println("HashMap:" + treeMap);
	
	
	}

}
