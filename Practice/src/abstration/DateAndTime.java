package abstration;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
public class DateAndTime {

	//Variable Arguments
	public static String undefinedArray(int... array)//It should be the last parameter of the method
	{
		return Arrays.toString(array);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LocalDateTime
		LocalDate date = LocalDate.of(2002, 06, 25);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(date.getYear());
		System.out.println(date.plusYears(23));
		LocalDate today = LocalDate.now();
		System.out.println(date.isAfter(today));
		System.out.println(date.format(formatter));
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.getHour()+":"+dateTime.getMinute()+":"+dateTime.getSecond());
		
		//Wrapper Class
		Double amount = new Double(12.3);
		Double amo = new Double(12.3);
		Double fine = Double.valueOf(12.3);
		System.out.println(amount.equals(fine)+" "+amount.equals(amo));
		
		//Calling Variable Arguments method
		int arr[] = {1,23,43,564,765,7,5,2,4,53,5,546};
		System.out.println(undefinedArray(arr));
		
		
		
	}

}
