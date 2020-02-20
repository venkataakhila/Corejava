import java.time.LocalDate;
import java.time.Year;
public class checkyear{
	public static void main(String args[])
	{
		Year y=Year.of(2020);
		LocalDate l=y.atDay(30);
		System.out.println(l);
	}
}