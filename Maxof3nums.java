import java.util.*;

class Maxof3nums{

	public static int maximum(int num1, int num2, int num3){
		return Math.max(num1, Math.max(num2, num3));
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num1 = scn.nextInt();
		System.out.println("Enter number: ");
		int num2 = scn.nextInt();
		System.out.println("Enter number: ");
		int num3 = scn.nextInt();
		
		int res = maximum(num1, num2, num3);
		System.out.println("The maximum of 3 numbers is: "+ res);
		scn.close();
	}
}