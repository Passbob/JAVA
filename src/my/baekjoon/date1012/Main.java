package my.baekjoon.date1012;

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            dp[i] = arr[i];

            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[j]+arr[i], dp[i]);
                    //dp[i] = dp[j]+arr[i];
                }
            }
        }

        for(int i=0;i<n;i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}