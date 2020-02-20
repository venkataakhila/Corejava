import java.io.File;//import the file class
public class fileinfo{
	public static void main(String args[])
	{
		File myobj=new File("G:/Filehandling.txt");
		if(myobj.exists())
		{
			System.out.println("File name:"+myobj.getName());
			System.out.println("Absolute path:"+myobj.getAbsolutePath());
			System.out.println("Writeable:"+myobj.canWrite());
			System.out.println("Readable:"+myobj.canRead());
			System.out.println("File size in bytes:"+myobj.length());
		}
		else
		{
			System.out.println("File doesnot exist");
		}
	}
}
