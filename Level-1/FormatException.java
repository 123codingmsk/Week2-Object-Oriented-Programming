import java.util.*;

public class FormatException{

	public static int parseint(String str){
		int num = Integer.parseInt(str);
		return num;
	}
	
	public static int parseint_2(String str){
		try{
			return parseint(str);
		}catch(NumberFormatException e){
			System.out.println("Number format Exception");
			return 0;
		}
	}

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		
		//int res = parseint(str);
		int res = parseint_2(str);
		System.out.print(res);
		
	}
}