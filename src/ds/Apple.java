package ds;import java.util.*;
public class Apple {
	private String color;
 
	public Apple(String color) {
	
		this.color = color;
	}
	/*public int hashCode(){
		//System.out.println("HashCode:"+this.color+":"+this.color.hashCode());
	//	return 10;
		return this.color.hashCode();	
	}*/
 
	public boolean equals(Object obj) {
		System.out.println("Equals"+ this.color.equals(((Apple) obj).color));
		if(obj==null) return false;
		if (!(obj instanceof Apple))
			return false;	
		if (obj == this)
			return true;
		System.out.println("Equals"+ this.color.equals(((Apple) obj).color));
		return this.color.equals(((Apple) obj).color);
	}

	public static void main(String[] args) {
		Apple a1 = new Apple("green");
		Apple a2 = new Apple("red");
		
		System.out.println(a1.hashCode());
 
		//hashMap stores apple type and its quantity
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		
	
		
		System.out.println(m.get(a1)+"COntains:"+ m.containsKey(a1)+":"+m.size());
	//	System.out.println(s1.hashCode()+":"+s2.hashCode()+":"+m.get(s1)+"COntains:"+ m.containsKey(s1)+":"+m.size());
	}
}