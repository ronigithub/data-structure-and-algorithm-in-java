package String;

import java.io.*;
import java.util.*;

//User function Template for Java

class Solution {
    static String solve(String S, int start, int end) {

        int n = S.length();

        while (start >= 0 && end < n) {

            if (S.charAt(start) == S.charAt(end)) {
                start--;
                end++;
            } else {
                break;
            }
        }

        return S.substring(start + 1, (end - start - 1));
    }

    static String longestPalin(String S) {

        // code here
        int n = S.length(), size = 0;
        String ans = null, temp;

        // expand from center
        for (int i = 0; i < n; i++) {
            // odd palindrome expand
            temp = solve(S, i, i);
            if (temp.length() > size) {
                size = temp.length();
                ans = temp;
            }

            // even palindrome expand
            temp = solve(S, i, i + 1);
            if (temp.length() > size) {
                size = temp.length();
                ans = temp;
            }
        }

        return ans;
    }
}

class LongestPalindrome {
    public static void main(String args[]) throws IOException {

        // Problem 1
//      Input: aaaabbaa
//      Output: aabbaa
        String S = "forgeeksskeegfor";
        System.out.println(Solution.longestPalin(S));

        //      Problem 2
//      Input: aaaabbaa
//      Output: aabbaa
//        String S2 = "aaaabbaa";
//        System.out.println(Solution.longestPalin(S2));
    }
}

// } Driver Code Ends
