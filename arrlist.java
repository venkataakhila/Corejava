import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class arrlist{
	public static void main(String args[])
	{
		//creating list of books
		List<Book> list=new ArrayList<Book>();
		//creating Books
		Book b1=new Book(101,"thinking java","kanna","person",4);
		Book b2=new Book(102,"system software","girija","hill",7);
		Book b3=new Book(103,"complete reference","herbet","apn",3);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//traversing list
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}
}