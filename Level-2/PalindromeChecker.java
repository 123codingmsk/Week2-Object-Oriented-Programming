import java.util.Scanner;
class PalindromeChecker{
	
	String text;
	
	PalindromeChecker(String name){
		this.text = name;
	}
	
	void checkpalindrome(){
		int l = 0;
		int e = text.length()-1;
		while(l < e){
			if(text.charAt(l) != text.charAt(e)){
				System.out.println("Not a Palindrome");
				return;
			}
			l++;
			e--;
		}
		System.out.println("Palindrome");
	}
	
	public static void main(String[] args){
		PalindromeChecker text1 = new PalindromeChecker("b b a b a");
		
		
		text1.checkpalindrome();
	}
}