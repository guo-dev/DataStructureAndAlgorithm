package com.test.map;

import java.util.*;

/**
 * @author guoqinglin
 * @create 2020-05-07-11:49
 */
public class MaxSubString {

    public static Map<String, Integer> MaxSubString(String s){

        String subString="";
        int n = s.length();
        int res = 0;
        int end=0,start=0;
        Set<Character> set=new HashSet<>();

        while(start<n && end<n){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }else{
                set.add(s.charAt(end++));
                res=Math.max(res,end-start);
                System.out.println(end-start);

             //   for(int i = )
            }
        }

        Map<String,Integer> result= new HashMap<>();
        result.put(subString,res);
        return result;


   }

    public static void main(String[] args) {

       System.out.println(MaxSubString("aaabbcdeee"));
    }
}
