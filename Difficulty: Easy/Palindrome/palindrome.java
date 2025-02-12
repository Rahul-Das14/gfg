//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt();
            boolean ans = ob.isPalindrome(n);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        
        int temp=n;
            int reverse=0,dig;
    
            while(n!=0)
            {
                if(n<0)
                    return false;
                dig=n%10;
                      // Check for overflow/underflow before updating `reversed`
                if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && dig > 7)) {
                    return false;  // Overflow
                }
                if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && dig < -8)) {
                    return false;  // Underflow
                }
    
                reverse=dig+reverse*10;
                n=n/10;
            }
        if(reverse==temp)
            return true;
        else
        return false;
    }
}