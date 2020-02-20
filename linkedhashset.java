import java.util.*;
public class linkedhashset{
	public static void main(String args[])
	{
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add(" ");//it takes hash value
		set.add("adi");
		set.add("sai");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())	
		{
			System.out.println(itr.next());
		}
	}
}