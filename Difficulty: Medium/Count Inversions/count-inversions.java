//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().inversionCount(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary ArrayList
        int left = low;      // Starting index of left half
        int right = mid + 1;  // Starting index of right half
        int cnt = 0;

        // Merge smaller elements first and count inversions
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); // Increment inversion count
                right++;
            }
        }

        // Append remaining elements from the left subarray
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Append remaining elements from the right subarray
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy merged elements back to the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);  // Recursively sort the left half
        cnt += mergeSort(arr, mid + 1, high); // Recursively sort the right half
        cnt += merge(arr, low, mid, high);  // Merge sorted halves and count inversions
        return cnt;
    }

    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }
}