//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> factorial = new ArrayList<>();
        generateFactorials(1, 1, n, factorial);
        return factorial;
    }

    static void generateFactorials(long current, long fact, long n, ArrayList<Long> factorial) {
        if (fact > n) {
            return; // Base case: stop recursion when factorial exceeds n
        }
        factorial.add(fact);
        generateFactorials(current + 1, fact * (current + 1), n, factorial);
    }
}