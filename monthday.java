import java.time.*;
public class monthday{
	public static void main(String args[])
	{
		MonthDay month=MonthDay.now();
		boolean b=month.isValidYear(2000);
		System.out.println(b);
	}
}