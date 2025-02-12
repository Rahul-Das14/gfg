//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        long sum = 0;
        long n = arr.length + 1;
        // Calculate the sum of the first n natural numbers using the formula: n * (n + 1) / 2
        sum = (long) n * (n + 1) / 2;
        // Calculate the sum of the elements in the array
        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }
        return (int)sum;
    }
}