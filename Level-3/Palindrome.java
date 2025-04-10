import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sn.nextLine();
        boolean palin1 = Palindrome1(str);
        boolean palin2 = Palindrome2(str);
        boolean palin3 = Palindrome3(str);
        System.out.println("Palindrome1: " + palin1);
        System.out.println("Palindrome2: " + palin2);
        System.out.println("Palindrome3: " + palin3);

        sn.close();
    }

    public static boolean Palindrome1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean Palindrome2(String str) {
        return Palindrome2(str, 0, str.length() - 1);
    }
    private static boolean Palindrome2(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return Palindrome2(str, start + 1, end - 1);
    }

    public static boolean Palindrome3(String string) {
        char[] reversed = new char[string.length()];
        int j = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed[j++] = string.charAt(i);
        }

        char[] original = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (reversed[i] != original[i]) {
                return false;
            }
        }
        return true;
    }
}
