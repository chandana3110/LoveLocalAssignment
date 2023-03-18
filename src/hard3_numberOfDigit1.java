import java.util.*;

public class hard3_numberOfDigit1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i *= 10) {
            int divider = i * 10;
            // finding the number of 1's in each place
            ans += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }
        System.out.println (ans);
    }
}




