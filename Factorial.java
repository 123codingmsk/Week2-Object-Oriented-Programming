import java.util.*;

class Factorial{

	public static int fact_recursive(int num){
		if(num == 0 || num == 1){
			return 1;
		}
		return num * fact_recursive(num-1);
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		int res = fact_recursive(num);
		System.out.println(res);
		
		scn.close();
	}
}