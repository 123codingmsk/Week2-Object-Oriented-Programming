import java.util.*;

class VowelsCons_2{
	
	 public static String checkCharacterType(char ch) {
        char lowerCh = toLowerCase(ch);

        if (lowerCh >= 'a' && lowerCh <= 'z') { 
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not Letter";
        }
    }

    public static char toLowerCase(char letter) {
        if (letter >= 'A' && letter <= 'Z') {
            return (char) (letter + 32);
        }
        return letter;
    }

    public static String[][] findVowelsConsonants(String word) {
        String[][] result = new String[word.length()][2];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            result[i][0] = String.valueOf(ch);  
            result[i][1] = checkCharacterType(ch);  
        }
        return result;
    }

    public static void displayTable(String[][] data) {
      
        for (String[] row : data) {
            System.out.println(row[0]+"\t"+row[1]);
        }
    }
		
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String word = scn.next();
		
		String[][] res = findVowelsConsonants(word);
		
		displayTable(res);
		
		scn.close();
		
	}
}