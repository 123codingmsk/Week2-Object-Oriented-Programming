import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class Zone{
	public static void main(String[] args){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss z");
		
		String gmt = ZonedDateTime.now(ZoneId.of("GMT")).format(formatter);
		System.out.println("GMT Time: "+gmt);
		
		String ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")).format(formatter);
		System.out.println("IST Time: "+ist);
		
		String pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")).format(formatter);
		System.out.println("PST Time: "+pst);
	}
}