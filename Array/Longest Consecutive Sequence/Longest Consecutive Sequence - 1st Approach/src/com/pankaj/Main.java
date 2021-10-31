package com.pankaj;

import java.util.Scanner;

public class Main {

    public static boolean findNumber(int num, int[] arr) {
        for (int a : arr) {
            if (a == num)
                return true;
        }
        return false;
    }

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int ans = 1;
        for (int i = 0; i < N; i++) {
            int start = arr[i];
            while (findNumber(start, arr)) {
                start++;
            }
            ans = Math.max(ans, start - arr[i]);
        }
        return ans;
    }


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lengthOfLongestConsecutiveSequence(arr,N));
    }
}
