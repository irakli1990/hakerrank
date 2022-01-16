package com.haker.rank;

import java.util.Scanner;

//Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
//
//        It's time to test your knowledge of Static initialization blocks. You can read about it here.
//
//        You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.
//
//        If B <=0 or H<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
//
//        Input Format
//
//        There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.
//
//        Constraints
//
//        Output Format
//
//        If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes

public class Solution000002 {
    static boolean flag;
    static int B;
    static int H;
    private static final Scanner scanner = new Scanner(System.in);

   static  {
        flag = false;
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(H <= 0 | B <= 0){
            try {
                flag = false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }else {
            flag = true;
        }
    }




    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        scanner.close();
    }
}
