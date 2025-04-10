import java.util.*;

class ShortLongstr{
	
	public static String[] split(String text){
		int wordcount = 1;
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == ' '){
				wordcount++;
			}
		}
		
		String[] temp = new String[wordcount];
		int index = 0;
		String word = "";
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) != ' '){
				word = word+ text.charAt(i);
			}else{
				if(!word.isEmpty()){
					temp[index++] = word;
					word = "";
				}
			}
		}
		if(!word.isEmpty()){
			temp[index] = word;
		}
		return temp;
	}
	
	public static int getLength(String text){
		int len = 0;
		try{
			while(true){
				text.charAt(len);
				len++;
			}
		}catch(Exception e){
			return len;
		}
	}
	
	public static String[][] getwordsLength(String[] words){
		String[][] wordlenArray = new String[words.length][2];
		
		for(int i=0; i<words.length; i++){
			wordlenArray[i][0] = words[i];
			wordlenArray[i][1] = String.valueOf(getLength(words[i]));
		}
		return wordlenArray;
	}
	
	public static int[] findMinMaxLen(String[][] wordlenArray){
		int minLen = Integer.parseInt(wordlenArray[0][1]);
		int maxLen = Integer.parseInt(wordlenArray[0][1]);
		
		for (int i = 1; i < wordlenArray.length; i++) {
            int length = Integer.parseInt(wordlenArray[i][1]);
            if (length < minLen) {
                minLen = length;
            }
            if (length > maxLen) {
                maxLen = length;
            }
        }
		
		return new int[]{minLen, maxLen};
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String text = scn.nextLine();
		
		String[] res = split(text);
		
		String[][] res_2 = getwordsLength(res);
		
		int[] minMax = findMinMaxLen(res_2);
		System.out.println("\nShortest length: "+minMax[0]);
		System.out.println("\nLongest length: "+minMax[1]);
	}
}