package in.co.rays;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateFormatech {
	public static void main(String[] args) throws ParseException {
		Date d= new Date();
SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		String str = format.format(d);
		System.out.println("Date: " +str);
		
		String str1= "22/03/2010";
		Object d1 = format.parseObject(str1);
		System.out.println(d1);
	}
}
