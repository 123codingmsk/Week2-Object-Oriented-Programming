import java.util.*;

class NumberGuessgame{

	public static int computerguess(){
		Random rand = new Random();
		return rand.nextInt(10);
	}

	public static String feedback(int comp_guess, int user_guess){
		String ans = "";
		
		if(comp_guess == user_guess){
			ans =  "Correct";
		}else if(user_guess > comp_guess){
			ans = "Low! Try again";
			
		}else{
			ans = "High! Try again";
		}
		return ans;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Give ur number: ");
		int user_guess = scn.nextInt();
		int comp_guess;
		do{
			System.out.print("Computer Guess: ");
			comp_guess = computerguess();
			System.out.print(comp_guess+"\n");
			String fb = feedback(comp_guess, user_guess);
			System.out.println(fb);
		}while(user_guess != comp_guess);
		
		scn.close();
	}
}