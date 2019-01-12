package com.shipra;

public class Main {

    public static void main(String[] args) {
	// bark(true,11);
        System.out.println(isLeapYear(` 25));
    }

    public static boolean isLeapYear(int year){
        if ((year<1)||(year>9999)){
            return false;
        }else
            if (((year%100)==0)){
            return false;
            }else
               if (((year%4)==0)||((year%100)==0)){
            return true;
            }
            return false;
    }
}
