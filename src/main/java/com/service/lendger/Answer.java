package com.service.lendger;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Answer {

//    Given a positive integer as an input, find smallest multiple of input which is made of digits 0s and 9s only
//    E.g.
//            input 1 - output 9
//    input 5 - output 90
//    input 11 - output 99
    static List<String> output = new LinkedList<>();
    static void helper(){
        Queue<String> q = new LinkedList<>();
        q.add("9");

        for (int count = 10000; count > 0; count --){
           String temp = q.peek();
           q.remove();
           output.add(temp);
           String temp2 = temp;
           q.add(temp + "0");
           q.add(temp2 + "9");
        }


    }

    static String getSmallestValue(int n){
        for (int i =0; i< output.size(); i++){
            if (Integer.parseInt(output.get(i))% n == 0){
                return  output.get(i);
            }
        }
        return "";
    }

    public static void main(String args[]){
        helper();
        int n = 31;
        String ans = getSmallestValue(n);
        System.out.println(ans);

    }


}
