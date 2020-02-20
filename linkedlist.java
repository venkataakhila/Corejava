import java.util.*;
public class linkedlist{
	public static void main(String args[])
	{
		LinkedList<String> a1=new LinkedList<String>();
		a1.add("akhi");
		a1.add("adi");
		a1.add("sai");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}