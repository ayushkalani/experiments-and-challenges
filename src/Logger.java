package com.ayush;

import java.util.HashMap;

public class Logger {

    private HashMap<String, Integer> stream;

    /**
     * Initialize your data structure here.
     */
    public Logger() {
        this.stream = new HashMap<String, Integer>();
    }

    /**
     * Returns true if the message should be printed in the given timestamp, otherwise returns false.
     * If this method returns false, the message will not be printed.
     * The timestamp is in seconds granularity.
     */
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean ans = true;
        int t = stream.get(message);
        if (t != 0) {
            if (Math.abs(stream.get(message) - timestamp) >= 10) {
                stream.put(message, timestamp);
                ans = true;
            } else {
                ans = false;
            }
        } else {
            stream.put(message, timestamp);
        }
        return ans;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */