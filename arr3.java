import java.util.*;
class arr3{
	public static void main(String args[]){
	ArrayList<Integer> aList1=new ArrayList<Integer>(7);
	aList1.add(1);
	aList1.add(2);
	aList1.add(9);
	aList1.clear();
	System.out.println("printing all elements of alist="+aList1);
	ArrayList<Integer> aList2=new ArrayList<Integer>(7);
	aList1.add(12);
	aList1.add(22);
	aList1.add(42);
	aList1.add(52);
	System.out.println("printing all elements of alist="+aList2);
	aList1.addAll(aList2);
	aList1.addAll(2,aList2);
	System.out.println("printing all elements of aList1 after using addAll method="+aList1);
	
	}
}