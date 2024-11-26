package com.gvp.calc;

public class echo {
   
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "not even";
        }
    }

    public static void main(String[] args) {
       
        int num=10;
        System.out.println(num + " is " + isEven(num));
        
    }
}

