package com.test.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoqinglin
 * @create 2020-05-07-13:15
 */
public class getMaxString {

    public static Map<String, Integer> lengthOfLongestSubstring(String s){
        //表示asc码位置。
        int[] hash = new int[128];
        //最长无重复子字符串的起始位置
        int lcStart = 0;
        //最长无重复子字符串的长度。
        int lcLen = 0;
        //当前无重复字符串的其实位置。
        int clcStart = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            int index = hash[c];
            hash[c] = i + 1;
            if(index > 0 && index > clcStart){
                clcStart = index;
            }else{
                int clen = (i + 1) - clcStart;
                if(clen > lcLen){
                    lcLen = clen;
                    lcStart = clcStart;
                }
            }
        }
        Map<String,Integer> result= new HashMap<>();
        result.put(s.substring(lcStart, lcStart+lcLen),lcLen);
        return result;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("aaabbcdeee"));
    }
}
