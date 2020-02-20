import java.util.*;
class arr5{
	public static void main(String args[]){
	ArrayList<Integer> aList=new ArrayList<Integer>(7);
	aList.add(1);
	aList.add(2);
	aList.add(9);
	
	//checking contains method
	boolean flag1=aList.contains(9);
	if(flag1==true){
	System.out.println("alist contains element 3");
	}
	else{
		System.out.println("alist doesn't contains element 3");
	}
	boolean flag2=aList.contains(7);
	if(flag2==true){
	System.out.println("alist contains element 7");
	}
	else{
		System.out.println("alist doesn't contains element 7");
	}
	}
}