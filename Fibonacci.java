import java.util.*;

class Fibonacci{

	public static int[] fibgenerator(int num){
		int[] temp = new int[num];
		int num1 = 0;
		int num2 = 1;
		
		temp[0] = num1;
		temp[1] = num2;
		
		for(int i=2; i<num; i++){
			int nextnum = num1 + num2;
			temp[i] = nextnum;
			num1 = num2;
			num2 = nextnum;
		}
		return temp;	
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		
		int[] arr = fibgenerator(num);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		scn.close();
	}
}