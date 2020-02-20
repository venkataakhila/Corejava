import java.util.Map;
import java.util.TreeMap;
import java.util.*;
class mapdemo{
	public static void main(String args[])
	{
		//creating map using treemap
		Map<String,Integer> set=new TreeMap<>();
		//insert elements to map
		set.put("second",2);
		set.put("first",1);
		System.out.println("map using treemap"+set);
		//replacing the values
		set.replace("first",11);
		set.replace("second",22);
		System.out.println("new map"+set);
		//remove elements from the map
		int removedValue=set.remove("first");
		System.out.println("removedvalue"+removedValue);
		
		
		
	}
}