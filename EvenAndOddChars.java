package com.hakerRank;

import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class EvenAndOddChars {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            String input;
            ArrayList<String> output = new ArrayList<String>();
            int numOfWords;

            System.out.print("How many words would you like to perform operation on?: ");
            numOfWords = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i<numOfWords; i++){
                System.out.println("Enter a word:");
                input = scanner.next();
                String evenChars = "", oddChars="";
                for (int j = 0; j<input.length(); j++){
                    if(j%2 ==0){
                        oddChars += input.charAt(j);
                    }else {
                        evenChars += input.charAt(j);
                    }
                }

                output.add(oddChars + " " + oddChars);
            }

            //print the output
            for (int i = 0; i<output.size(); i++){
                System.out.println(output.get(i));
            }
            int[] array;


        }

}
