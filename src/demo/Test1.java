package demo;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = null;
		Test1 t =new Test1();
		list = t.a(list);
		System.out.println(list);
	}
	
	private List<String> a(List<String> list) {
		list = b(list);
		return list;
	}
	
	private List<String> b(List<String> list) {
		if(list == null)
			list = new ArrayList<>();
		
		list.add("s");
		return list;
	}
	
}
