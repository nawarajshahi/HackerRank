package com.hakerRank;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class DataType {
   public static void main(String[] args) {
       int i;
       double d;

       Scanner scan = new Scanner(System.in);
        String s = "HackerRank ";

        i = scan.nextInt();
        d = scan.nextDouble();
        scan.nextLine();
        String secondStr = scan.nextLine();

        System.out.println(s + secondStr);

    }

}
