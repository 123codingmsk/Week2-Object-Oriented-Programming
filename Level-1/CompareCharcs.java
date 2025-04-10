import java.util.*;

public class CompareCharcs{
	
	public static String[] strTochars(String str){
		String[] temp = new String[str.length()];
		for(int i=0; i<str.length(); i++){
			temp[i] = String.valueOf(str.charAt(i));
		}
		return temp;
	}
	
	public static char[] toChararray(String str){
		return str.toCharArray();
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String str = scn.next();
		
		String[] res = strTochars(str);
		char[] res_1 = toChararray(str);
		
		String[] charArraytoString = new String[res_1.length];
		for(int i=0; i<res_1.length; i++){
			charArraytoString[i] = String.valueOf(res_1[i]);
		}
		
		System.out.println("The first Array: ");
		for(int i=0; i<res.length; i++){
			System.out.print(res[i]+" ");
		}
		
		System.out.println("The second Array: ");
		for(int i=0; i<charArraytoString.length; i++){
			System.out.print(charArraytoString[i]+" ");
		}
		
		if(Arrays.equals(res, charArraytoString)){
			System.out.println("Both are equal!");
		}else{
			System.out.println("Both are not equal!");
		}			
		
		scn.close();
	}
}