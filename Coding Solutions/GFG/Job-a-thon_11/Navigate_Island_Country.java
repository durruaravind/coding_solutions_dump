// { Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        // taking testcases
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            String[] starr = str.split(" ");

            // input n and d
            int n = Integer.parseInt(starr[0]);
            int m = Integer.parseInt(starr[1]);
            int x = Integer.parseInt(starr[2]);
            int[] A = new int[n];
            String str1 = br.readLine();
            String[] starr1 = str1.split(" ");

            // inserting elements in the array
            for (int j = 0; j < n; j++) {
                A[j] = Integer.parseInt(starr1[j]);
            }
            int B[][] = new int[m][2];
            for (int j = 0; j < m; j++) {
                str1 = br.readLine();
                starr1 = str1.split(" ");
                B[j][0] = Integer.parseInt(starr1[0]);
                B[j][1] = Integer.parseInt(starr1[1]);
            }
            long res = Solution.minimumCost(n, m, x, A, B);
            System.out.println(res);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    static long minimumCost(int n, int m, int x, int A[], int B[][]) {
        // add your code here
        int k=0;
        for(int i=0;i<m;i++)
        {
            if((B[i][0]==1&&B[i][1]==n)||(B[i][0]==n&&B[i][1]==1))
            {
                k++;break;
            }
        }
        if(k==0)
        return(A[1]+A[n]+x);
        else
        return (A[n]+minimumCost(n-1,m,x,A,B)+x);
    }
}