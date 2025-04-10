import java.util.Scanner;

public class FrequencyUnique {
       public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sn.nextLine();
        String[][] frequency = Frequency(input);
        display(frequency);
        sn.close();
    }

    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[index++] = text.charAt(i);
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    public static String[][] Frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Character | Frequency");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("   %s      |    %s\n", data[i][0], data[i][1]);
        }
    }
}
