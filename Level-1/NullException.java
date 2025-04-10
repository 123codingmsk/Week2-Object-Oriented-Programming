import java.util.*;

public class NullException{
	
	public static void returnException(){
		String str = null;
		
		System.out.println(str.length());
	}
	
	public static void returnException_2(){
		String str = null;
		
		try{
			System.out.println(str.length());
		}catch(NullPointerException e){
			System.out.println("NullPointerException! String is null");
		}
	}
	
	public static void main(String[] args){
		//returnException();
		
		returnException_2();
	}
}