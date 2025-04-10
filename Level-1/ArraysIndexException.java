import java.util.*;

public class ArraysIndexException{

	public static String exception(String[] names){
		return names[3];
	}
	
	public static String exception_2(String[] names){
		try{
			return names[3];
		}catch( ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out of Bounds");
			return "No value at 3";
		}
	}

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String[] names = new String[3];
		for(int i=0; i<names.length; i++){
			names[i] = scn.next();
		}
		
		exception_2(names);
	}
}