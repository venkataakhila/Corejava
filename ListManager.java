import java.util.*;
class ListManager{
	public static void main(String args[])
	{
		ArrayList<String> al1=new ArrayList<String>();
		ArrayList<String> al2=new ArrayList<String>();
		al1.add("akhi");
		al1.add("adi");
		al1.add("sai");
		al2.add("akhi");
		al2.add("priya");
		al2.add("jyo");
		for(String i:al1)
		System.out.println(i);
		al1.retainAll(al2);//here retainall method display the common elements in arraylist
		System.out.println(al1);		
		
	}
}