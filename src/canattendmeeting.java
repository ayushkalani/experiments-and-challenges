package com.ayush;

public class canattendmeeting {

    public static boolean canAttendMeetings(int[][] intervals) {
        for (int k = 0; k < intervals.length; k++) {
            for (int i = k+1; i < intervals.length; i++) {
                return !((intervals[i][0] >= intervals[k][0] && intervals[i][0] < intervals[k][1]) || (intervals[i][1] <= intervals[k][1] && intervals[i][1] < intervals[k][0]));
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] ocean = {
                {13, 15},
                {1, 13},
                {5, 14}};
        System.out.println(canAttendMeetings(ocean));
    }
}
