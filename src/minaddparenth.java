package com.ayush;

public class minaddparenth {


    public int minAddToMakeValid(String S) {
        int open = 0, ans = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }
        return ans;
    }
}
