//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class addingArrayEle {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().minOperations(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java







//User function Template for Java




class Solution {
    int minOperations(int[] arr, int n, int k) {
        // code here
        int count = 0;
        PriorityQueue<Integer> newQueue = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++) {
            newQueue.add(arr[i]);
        }
        
        while(newQueue.peek() < k && newQueue.size() > 1) {
            
            int a = newQueue.poll();
            int b = newQueue.poll();
            newQueue.add(a+b);
            count++;
        }
        
        if(newQueue.peek() < k )
            return -1;
        return count;
    }
    
}