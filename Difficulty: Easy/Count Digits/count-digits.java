//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        int i,temp,dig,count=0;
        temp=n;
        while(temp>0)
        {
            dig=temp%10;
            if(dig==0)
            {}
            
            else if(n%dig==0)
            {
                count++;
            }
            temp=temp/10;
        }
        return count;
        
    }
}