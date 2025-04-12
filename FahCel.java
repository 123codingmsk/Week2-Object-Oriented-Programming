import java.util.*;

class FahCel{

	public static double fahtocel(int temp){
		double celsius = (((double)temp - 32) * 5)/9;
		return celsius;
	}
	
	public static double celtofah(int temp){
		double fahrenheit =	(((double)temp * 9)/5)+32;
		return fahrenheit;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int temp = scn.nextInt();
		
		double res1 = fahtocel(temp);
		double res2 = celtofah(temp);
		
		System.out.println("Fahrenheit to Celsius: "+res1);
		System.out.println("Celsius to Fahrenheit: "+res2);
		
		scn.close();
	}
}