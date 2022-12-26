package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ListMap {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("가");
		list.add("나");
		System.out.println(list.size());
		list.add(0, "다"); //값이 밀린다
		System.out.println(list.size());
		
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.printf("%s,",string);
		} System.out.println();
		
		System.out.println(list.get(0));
		list.remove(0);
		for (String string : list) {
			System.out.printf("%s,",string);
		} System.out.println();
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put("a", "ㄱ");
		map.put("a", "ㄴ");
		map.put("b", "ㄷ");
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get("a"));
		System.out.println(map.entrySet());
		System.out.println(map.containsKey("ㄴ"));
		System.out.println(map.containsValue("ㄴ"));
			
	}	
}
