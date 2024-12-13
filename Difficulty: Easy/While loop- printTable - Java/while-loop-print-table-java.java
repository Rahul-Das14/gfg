//{ Driver Code Starts

// } Driver Code Ends
//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num=n*10;
        while(num/n>=1)
        {
            System.out.print(num+" ");
            num=num-n;
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends