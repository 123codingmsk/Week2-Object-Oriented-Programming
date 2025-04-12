import java.util.*;

class GcdLcm{

	public static int findGcd(int num1, int num2){
		if(num2 == 0) return num1;
		return findGcd(num2, num1 % num2);
	}
	
	public static int findLcm(int num1, int num2){
		return (num1 * num2) / findGcd(num1, num2);
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		int res1 = findGcd(num1, num2);
		int res2 = findLcm(num1, num2);
		
		System.out.println("GCD of "+num1+", "+num2+" is: "+res1);
		System.out.println("LCM of "+num1+", "+num2+" is: "+res2);
		
		scn.close();
	}
}