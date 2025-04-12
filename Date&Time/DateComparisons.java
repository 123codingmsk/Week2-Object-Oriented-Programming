import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateComparisons{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String inputd1 = scn.nextLine();
		String inputd2 = scn.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date1 = LocalDate.parse(inputd1, formatter);
		LocalDate date2 = LocalDate.parse(inputd2, formatter);
		
		boolean d1 = date1.isBefore(date2);
		boolean d2 = date1.isAfter(date2);
		boolean d3 = date1.isEqual(date2);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}