import java.util.*;

class Calculator{

	public static double calculate(double num1, double num2, char op){
		double ans;
		switch(op){
			case '+':
				ans = num1 + num2;
				break;
			case '-':
				ans = num1 - num2;
				break;
			case '*':
				ans = num1 * num2;
				break;
			case '/':
				ans = num1 / num2;
				break;
			default:	
				return 0;
		}
		return ans;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		double num1 = scn.nextDouble();
		double num2 = scn.nextDouble();
		char op = scn.next().charAt(0);
		
		double res = calculate(num1, num2, op);
		System.out.println(num1 + " "+op+" "+num2+" = " + res);
		
		scn.close();
	}
}