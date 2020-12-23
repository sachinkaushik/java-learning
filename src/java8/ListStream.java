package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListStream {

	public static void main(String[] args) {
		List<HashMap<String,String>> list = new ArrayList<>();
		HashMap<String, String> map = new HashMap<>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("d", "4");
		map1.put("e", "5");
		map1.put("f", "6");
	}

}
