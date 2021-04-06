package com.ayush;


public class countsubmatrice {


    public static void main(String[] args) {
        int x = 121;
        int palin = 121;
        int og = x;
        int newNumber = 0;
        int n = 0;
        while(x > 0) {
            n++;
            x /= 10;
        }
        while(palin > 0) {
            newNumber += (palin % 10) * (int)Math.pow(10,--n);
            palin /= 10;
        }
        System.out.println(newNumber);
        System.out.println(newNumber == og);
    }
}
