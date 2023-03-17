import java.util.*;

public class easy1_StringLength {
    public static int lengthOfLastWord(String s){
        // trim the string if there are spaces before characters
        s = s.trim();
        int lengthLast = 0;
        // last word length
        for(int i=s.length()-1 ; i>=0 ;i--){
            if(s.charAt(i) != ' '){
                lengthLast++;
            }else{
                break;
            }
        }
        return lengthLast;
    }
    public static void main(String [] args){
        // example test cases
        String s = "Hello World";
        System.out.println("length of last word : " + lengthOfLastWord(s));

        s = "   fly me   to   the moon  ";
        System.out.println("length of last word : " + lengthOfLastWord(s));

        s = "luffy is still joyboy";
        System.out.println("length of last word : " + lengthOfLastWord(s));
    }
}
