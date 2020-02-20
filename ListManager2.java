import java.util.*;
class ListManager2{
	public static void main(String args[])
	{
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("jyo");
		al1.add("priya");
		al1.add("akhi");
		Collections.sort(al1);
		Iterator itr=al1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	
	}
}