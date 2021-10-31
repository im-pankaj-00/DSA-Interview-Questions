package com.pankaj;

import java.util.Arrays;

import java.util.Scanner;

public class Main {

    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        Arrays.sort(arr);
        int sequenceLen = 1;
        int maxLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                sequenceLen++;
            } else if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                sequenceLen = 1;
            }
            maxLen = Math.max(maxLen, sequenceLen);
        }
        return maxLen;
    }


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(lengthOfLongestConsecutiveSequence(arr, N));
    }
}
