import java.util.Scanner;
import java.util.Arrays;


public class UniqueString {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sn.nextLine();
        int len=length(str);
        char[] unique=unique(str);
        System.out.println("The length of the string is "+len);
        System.out.println("Unique characters in the string are "+Arrays.toString(unique));
       
        sn.close();
    }

    public static int length(String s){
        char[] arr= s.toCharArray();
        int len=arr.length;
        return len;
    }

    public static char[] unique(String st){
        char[] unichar=new char[st.length()]; int index = 0;
        for(int i=0;i<st.length();i++){
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unichar[index++] = st.charAt(i);
            }
        }
        return unichar;

    }
}

