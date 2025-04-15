import java.util.*;

class Lexicograph{

	public static void findLexOrder(String str1, String str2){
		int n = str1.length();
		int m = str2.length();
		
		int i=0;
		int j=0;
		while(i < n && j < m){
			int ch1 = str1.charAt(i);
			int ch2 = str2.charAt(j);
			
			if(ch1 > ch2){
				System.out.println(str2+" comes before "+str1);
				return;
			}else if(ch1 < ch2){
				System.out.println(str1+" comes before "+str2);
				return;
			}
			i++;
			j++;
		}
	}
	
	public static void main(String[] args){
		
		String str1 = "hum";
		String str2 = "mum";
		
		findLexOrder(str1, str2);
		
		
	}
}



