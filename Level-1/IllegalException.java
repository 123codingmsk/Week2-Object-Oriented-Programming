import java.util.*;

public class IllegalException{

	public static String substrException(String str, int start, int end){
		String temp = str.substring(start, end);
		return temp;
	}
	
	public static String substrException_2(String str, int start, int end){
		try{
			String temp = substrException(str, start, end);
			return temp;
		}catch(IllegalArgumentException e){
			System.out.println("It is an IllegalArgumentException, i.e input should be in bounds");
			return "Invalid range";
		}
	}

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		int start = scn.nextInt();
		int end = scn.nextInt();
		
		//String res = substrException(str, start, end);
		String res = substrException_2(str, start, end);
	}
}