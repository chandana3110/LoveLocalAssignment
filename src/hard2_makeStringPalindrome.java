import java.util.*;

public class hard2_makeStringPalindrome {
    public static int StringPalindrome(String A){
        String s= new String(A);
        StringBuilder sb = new StringBuilder(A);
        s += "$" + sb.reverse();
        int lps[];
        lps = computeLps(s);
        return Math.max(A.length()-lps[(s.length())-1],0);
    }
    public static int[] computeLps(String s){
        int n=s.length();
        int i=1, l=0;
        int [] lps = new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(l)){
                lps[i]=++l;
                i++;
            }else {
                if(l>0){
                    l=lps[l-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String [] args){
        // example test cases
        String A = "aacecaaa";
        int n = StringPalindrome(A);
        String A2 = A.substring(A.length()-n);
        StringBuilder sb = new StringBuilder(A2);
        sb.reverse();
        A=sb+A;
        System.out.println(A);

        A = "abcd";
        n = StringPalindrome(A);
        String A3 = A.substring(A.length()-n);
        StringBuilder sb2 = new StringBuilder(A3);
        sb2.reverse();
        A=sb2+A;
        System.out.println(A);

    }
}

