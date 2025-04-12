import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DateDiffFormats{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		LocalDate currdate = LocalDate.now();
	
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		
		System.out.println(currdate.format(format1));
		System.out.println(currdate.format(format2));
		System.out.println(currdate.format(format3));
		
	}
}