package ds;
import java.io.*;
import java.util.*;
 
class Geek 
{
    String name;
    int id;
      
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
     }
     
    @Override
    public int hashCode()
    {
          
        // We are returning the Geek_id 
        // as a hashcode value.
        // we can also return some 
        // other calculated value or may
        // be memory address of the 
        // Object on which it is invoked. 
        // it depends on how you implement 
        // hashCode() method.
        return this.id;
    }
      
}
 
class GFG 
{
    public static void main (String[] args)
    {
        Set s1=new HashSet();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Set s2=new HashSet();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4); 
        System.out.println(s2.containsAll(s1));
        Map map1=new HashMap();
        map1.put(1,"abc");
        map1.put(2,"bcd");
        map1.put(3,"abc");
        Map map2=new HashMap();
        map2.put(1,"abc");
        map2.put(2,"bcd");
        map2.put(3,"abc");
        System.out.println(map1.equals(map2));
        // creating two Objects with 
        // same state
        Geek g1 = new Geek("aditya", 1);
        Geek g2 = new Geek("aditya", 1);
         
        Map<Geek, String> map = new HashMap<Geek, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");
         
        for(Geek geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }
        if(map.containsKey(g2))
        {
        	System.out.println("contain");
        }
 
    }
}