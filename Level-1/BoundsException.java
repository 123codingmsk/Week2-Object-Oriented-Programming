import java.util.*;

public class BoundsException{

	public static char exception(String str){
		return str.charAt(5);
	}
	
	public static char exception_2(String str){
		try{
			char ch = exception(str);
			System.out.print(ch);
			return ch;
		}catch(StringIndexOutOfBoundsException e){
			System.out.print("Exception found! Out of Bounds");
			return '\0';
		}
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		
		//char res = exception(str);
		char res2 = exception_2(str);
		
		//System.out.println(res);
		System.out.println(res2);
	}
}