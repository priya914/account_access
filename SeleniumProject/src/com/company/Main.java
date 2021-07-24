package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Supriya";
        String t="";

        for(int i=s.length()-1;i>=0;i--)
        {
            t=t+s.charAt(i);

        }

        System.out.println(t);
    }
}
