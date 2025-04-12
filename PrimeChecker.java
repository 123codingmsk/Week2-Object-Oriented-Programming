import java.util.*;

class PrimeChecker{

	public static boolean primecheck(int num){
		if(num <= 1){
			return false;
		}
		
		for(int i=2; i*i<=num; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		boolean res = primecheck(num);
		
		if(res){
			System.out.println("It is a Prime Number");
		}else{
			System.out.println("It is not a Prime Number");
		}
		
		scn.close();
	}
}