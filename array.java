class array
{
	public static void main(String args[])
	{
		int a[]=new int[5];//declaration and instantiation
		a[0]=1;//initialization
		a[1]=3;
		a[2]=4;
		a[3]=56;
		a[4]=89;
		//traversing array
		for(int i=0;i<a.length;i++)//length is the property of array
		System.out.println(a[i]);
		
	}
}