package com.ayush;

import java.util.Stack;

public class backspacestringcompare {

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<Character>();
        Stack<Character> t = new Stack<Character>();
        // traverse two string at once
        for(Character c : S.toCharArray()){
            
        }


        for(Character c : S.toCharArray()){
            if(c == '#' && !s.isEmpty()){
                s.pop();
            } else {
                s.push(c);
            }
        }
        for(Character c : T.toCharArray()){
            if(c == '#' && !t.isEmpty()){
                t.pop();
            } else if(c != '#'){
                t.push(c);
            }
        }
        return comp(s, t);
    }

    public static boolean comp(Stack<Character> a, Stack<Character> b){
        if(a.size() != b.size()){
            return false;
        }
        while(!a.isEmpty() && !b.isEmpty()){
             if(a.pop() != b.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
    }
}
