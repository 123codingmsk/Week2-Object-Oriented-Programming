import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateArithmetic{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a date ( dd-MM-yyyy ): ");
		String inpdate = scn.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate date = LocalDate.parse(inpdate, formatter);
		date = date.plusDays(7).plusMonths(1).plusYears(2);
		date = date.minusWeeks(3);
		System.out.println(date);
		
	}
}