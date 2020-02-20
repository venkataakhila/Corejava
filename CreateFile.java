
//import the file class
import java.io.File;
//import the IOException class to handle errors
import java.io.IOException;
public class CreateFile{
	
	public static void main(String args[])
	{
		try{
		//creating an object of a file
			File myObj=new File("G:Filehandling.txt");
			if(myObj.createNewFile()){
				System.out.println("file created"+myObj.getName());
			}
			else{
			System.out.println("file already exists");
			}
			
			
		}
	
		catch(IOException e)
		{
		System.out.println("an error occurred");
		e.printStackTrace();
		}
	}
}

	