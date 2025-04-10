import java.util.*;

class SplitText_2{
	
	public static String[] splittext(String text){
		int wordCount = 1;
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == ' '){
				wordCount++;
			}
		}
		
		String[] temp = new String[wordCount];
		int index = 0;
		String word = "";
		
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == ' '){
				if(!word.isEmpty()){
					temp[index++] = word;
					word = "";
				}
			}else{
				word += text.charAt(i);
			}
		}
		if(!word.isEmpty()){
			temp[index] = word;
		}
		return temp;
	}
	
	public static int getLength(String str){
		int count = 0;
		try{
			while(true){
				str.charAt(count);
				count++;
			}
		}catch(Exception e){
			return count;
		}
	}
	
	public static String[][] getWordsLength(String[] word){
		String[][] wordlenArray = new String[word.length][2];
		
		for(int i=0; i<word.length; i++){
			wordlenArray[i][0] = word[i];
			wordlenArray[i][1] = String.valueOf(getLength(word[i]));
		}
		return wordlenArray;
	}
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		String text = scn.nextLine();
		
		String[] res = splittext(text);
		
		String[][] res2 = getWordsLength(res);
		
		for(String[] row : res2){
			System.out.println(row[0] + "\t"+Integer.parseInt(row[1]));
		}
		scn.close();
	}
}