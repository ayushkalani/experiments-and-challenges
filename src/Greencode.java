package com.ayush;

import java.util.Arrays;
import java.util.Collections;

public class Greencode {
    public static final String RED = "RED";
    public static final String YELLOW = "YELLOW";
    public static final String GREEN = "GREEN";
    public static final float MAX_THRESHOLD_CPU_USAGE = 0.9f;
    public static final double MAX_CPU_USAGE_NULL = 0.30;
    public static final double MAX_MEMORY_USAGE_NULL = 0.25;
    public static final int MEMORY_THRESHOLD = 19660;

    public static String verify(Float[] cpuUsage, Integer[] usedMemory) {
        int rulesProcessedFalse = 0;
        int lcpuUsage = cpuUsage.length;
        int lusedMemory = usedMemory.length;
        int nunmberOfCpuUsageNull = countNull(cpuUsage);
        int nunmberOfUsageMemoryNull = countNull(usedMemory);

        if (lcpuUsage == 1 && lusedMemory == 1) {
            return processRules(Integer.MAX_VALUE);
        }
        // rule 7
        if (nunmberOfCpuUsageNull == lcpuUsage && nunmberOfUsageMemoryNull == lusedMemory) {
            return processRules(Integer.MAX_VALUE);
        }
        // remove null values from array
        cpuUsage = Arrays.stream(cpuUsage).filter(s -> (s != null)).toArray(Float[]::new);
        usedMemory = Arrays.stream(usedMemory).filter(s -> (s != null)).toArray(Integer[]::new);

        Float[] cpuUsageUnSorted = Arrays.copyOf(cpuUsage, cpuUsage.length);
        Integer[] useMemoryUnSorted = Arrays.copyOf(usedMemory, usedMemory.length);

        Arrays.sort(usedMemory, Collections.reverseOrder());
        Arrays.sort(cpuUsage, Collections.reverseOrder());

        // rule 5
        if (nunmberOfCpuUsageNull > (int) (lcpuUsage * MAX_CPU_USAGE_NULL)) {
            if (!isRule3Valid(usedMemory)) {
                rulesProcessedFalse++;
            }
            if (!isRule4Valid(useMemoryUnSorted, lusedMemory)) {
                rulesProcessedFalse++;
            }
            return processRules(rulesProcessedFalse);
        }

        // rule 6
        if (nunmberOfUsageMemoryNull > (int) (lusedMemory * MAX_MEMORY_USAGE_NULL)) {
            if (!isRule1Valid(cpuUsage[0])) {
                rulesProcessedFalse++;
            }
            if (!isRule2Valid(cpuUsageUnSorted, useMemoryUnSorted, cpuUsage[0], usedMemory[0])) {
                rulesProcessedFalse++;
            }
            return processRules(rulesProcessedFalse);
        }

        // normal flow of rules
        if (!isRule1Valid(cpuUsage[0])) {
            rulesProcessedFalse++;
        }
        if (!isRule2Valid(cpuUsageUnSorted, useMemoryUnSorted, cpuUsage[0], usedMemory[0])) {
            rulesProcessedFalse++;
        }
        if (!isRule3Valid(usedMemory)) {
            rulesProcessedFalse++;
        }
        if (!isRule4Valid(useMemoryUnSorted, lusedMemory)) {
            rulesProcessedFalse++;
        }
        return processRules(rulesProcessedFalse);
    }

    public static <T> int countNull(T[] src) {
        int ans = 0;
        int l = src.length;
        for (int i = 0; i < l; i++) {
            if (src[i] == null) {
                ++ans;
            }
        }
        return ans;
    }

    public static String processRules(int falseRules) {
        if (falseRules > 1) {
            return RED;
        } else if (falseRules == 1) {
            return YELLOW;
        } else {
            return GREEN;
        }
    }

    public static boolean isRule1Valid(float maxCpuUsage) {
        return (maxCpuUsage < MAX_THRESHOLD_CPU_USAGE);
    }

    // both max values should not occur at the same time
    // arrays can be of different length
    public static boolean isRule2Valid(Float[] cpuUsage, Integer[] usedMemory, float cpuMax, int memMax) {
        int n = Math.min(cpuUsage.length, usedMemory.length);
        for (int i = 0; i < n; i++) {
            if (cpuUsage[i] == cpuMax && usedMemory[i] == memMax) {
                return false;
            }
        }
        return true;
    }

    // should not be greater than MEMORY_THRESHOLD
    public static boolean isRule3Valid(Integer[] usageMemory) {
        return (usageMemory[0] < MEMORY_THRESHOLD);
    }

    // should not increase in 3 consecutive values
    public static boolean isRule4Valid(Integer[] usageMemory, int l) {
        for (int i = 0, j = 1, k = 2; i < l - 2; i++, j++, k++) {
            if (usageMemory[i] < usageMemory[j] && usageMemory[j] < usageMemory[k]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Float[] cpuUsage = {0.2f, 0.5f, 0.8f, 0.5f, null, null, null, null, null};
        Integer[] usedMemory = {200, 500, 150, 3124, 8, 1, null, null, null, null, null};
        System.out.println(verify(cpuUsage, usedMemory));
    }
}