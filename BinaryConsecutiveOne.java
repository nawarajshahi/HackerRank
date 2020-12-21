package com.hakerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryConsecutiveOne {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a 10 base integer: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        int counter = 0;
        int maxOneConsecutiveCounter = 0;
        while(n >=1){
            int remainder = n %2;
            if(remainder ==1){
                counter +=1;
                if(counter >=maxOneConsecutiveCounter){
                    maxOneConsecutiveCounter = counter;
                }
            }else{
                counter = 0;
            }

            n/=2;
        }

        System.out.println("Maximum consecutive ones possible is: "+ maxOneConsecutiveCounter);
    }

}


