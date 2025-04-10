import java.util.*;

class Vote{
	
	public static int[] genrandom(int num){
		Random rand = new Random();
		int[] temp = new int[num];
		for(int i=0; i<num; i++){
			int randnum = rand.nextInt(90) + 10;
			temp[i] = randnum;
		}
		return temp;
	}
	
	public static boolean[] canVote(int[] arr){
		boolean[] temp = new boolean[arr.length];
		for(int i=0; i<arr.length; i++){
			if(arr[i] < 18){
				temp[i] = false;
			}else{
				temp[i] = true;
			}
		}
		return temp;
	}
	
	public static int[][] displaytable(int[] arr, boolean[] boolvalues){
		int[][] temp = new int[arr.length][2];
		for(int i=0; i<arr.length; i++){
			temp[i][0] = arr[i];
			temp[i][1] = boolvalues[i] ? 1 : 0;
		}
		return temp;
	}
		
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int[] arr = genrandom(10);
		
		boolean[] boolvalues = canVote(arr);
		
		int[][] res = displaytable(arr, boolvalues);
		
		for(int i=0; i<res.length; i++){
			System.out.println(res[i][0]+" "+res[i][1]);
		}
		
		scn.close();
		
	}
}