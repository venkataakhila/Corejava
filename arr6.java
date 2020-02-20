import java.util.*;
class arr6{
	public static void main(String args[]){
	ArrayList<String> aList=new ArrayList<String>(7);
	aList.add("learning");
	aList.add("java");
	aList.add("html");
	System.out.println("array list string="+aList);
	int value1=aList.indexOf("java");
	System.out.println("index retrived of java"+value1);
	int value2=aList.indexOf("html");
	System.out.println("index retrived "+value2);
	}
	
}