import java.util.*;

class Length{
	
	public static int findLength(String word){
		int count = 0;
		try{
			while(true){
				word.charAt(count);
				count++;
			}
		}catch(RuntimeException e){
			return count;
		}
	}
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		String word = scn.next();
		
		int res = findLength(word);
		System.out.println("The length of word " +word+" is: "+res);
	}
}