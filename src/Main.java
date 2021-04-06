package com.ayush;

public class Main extends Object {


    public static int getGreatestCommonDivisor(int f, int s){
        if (f < 10 || s < 10 ) return -1;
        int m = Math.max(f,s);
        int ans=1;
        for(int i=1;i<m/2;i++) {
            if ((f % i == 0) && (s % i == 0)) ans = i;
        }
        return ans;
    }

//    public static void main(String[] args) {
//	// write your code here
//        int a = 10;
//        byte b  = 20;
//        short c = 30;
//        long l = 50_000 + 10 * (a+b+c);
//        float f = 5.25f/2f;
//        double d = 3.008969868/2.3;
////        System.out.println(Float.MAX_VALUE);
////        System.out.println(Float.MIN_VALUE);
////        System.out.println(Double.MAX_VALUE);
////        System.out.println(Double.MIN_VALUE);
////        System.out.println("f="+f);
////        System.out.println("d="+d);
////        char my = 'l';
////        char uc = '\u090F';
////        System.out.println(uc);
////        boolean hasPermissions = false;
////        String re = "rehmakarrabba";
////        boolean s = hasPermissions ? true : false;
////        System.out.println((int)Math.pow(2.0,32.0));
////          Bank hdfc = new Bank(12387312, 1000L, "978923222");
//////          hdfc.depositFunds(10);
//////            hdfc.depositFunds(190000);
////            hdfc.withdrawFunds(1099900);
////          System.out.println(hdfc.getBalance());
//
//    Dog tucker = new Dog("tucker",4, 55, 5);
////    System.out.println(tucker.eat());
//        tucker.eat();
//
//
//
//    }

}
