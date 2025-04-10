8th solution

import java.util.Scanner;

public class Anagram{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = sn.nextLine();
        
        System.out.print("Enter the second text: ");
        String text2 = sn.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sn.close();
    }

    public static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }

}