import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sn.nextLine();
        String[][] frequency = getFrequency(input);
        displayFrequency(frequency);
        sn.close();
    }

    public static String[][] getFrequency(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        String[][] result = new String[256][2];
        int index = 0;
        boolean[] added = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!added[ch]) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                added[ch] = true;
                index++;
            }
        }

        String[][] trim = new String[index][2];
        for (int i = 0; i < index; i++) {
            trim[i][0] = result[i][0];
            trim[i][1] = result[i][1];
        }

        return trim;
    }

    public static void displayFrequency(String[][] freq) {
        System.out.println("Character | Frequency");
        for (int i = 0; i < freq.length; i++) {
            System.out.printf("   %s      |    %s\n", freq[i][0], freq[i][1]);
        }
    }

}

