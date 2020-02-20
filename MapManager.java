import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
class MapManager
{
	public static void main(String args[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("1","akhi");
		hm.put("2","jyo");
		hm.put("3","priya");
		//get all keys
		Set<String> keys = hm.keySet();
        	for (String k : keys) {
            		System.out.println("Key: " + k);
		}
		//get all values
		Collection<String> value = hm.values();
        	for (String k : value) {
            		System.out.println("values: " + k);
		}
	}
}