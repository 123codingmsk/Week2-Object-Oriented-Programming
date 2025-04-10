import java.util.*;

class Trim{
	
	public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end}; 
    }

    public static String customSubstring(String text, int start, int end) {
		if(start > end) return "";
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i); 
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true;  
    }
	 
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String text = scn.nextLine();
		
		int[] res = findTrimIndexes(text);
		String subs = customSubstring(text, res[0], res[1]);
		
		String builttrim = text.trim();
		
		boolean value = compareStrings(builttrim, subs);
		
		System.out.println(subs);
		System.out.println(builttrim);
		
		if(value){
			System.out.println("Both are same");
		}else{
			System.out.println("Both aren't same");
		}
		
		scn.close();
		
	}
}