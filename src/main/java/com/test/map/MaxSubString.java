package com.test.map;

import java.util.*;

/**
 * @author guoqinglin
 */
public class MaxSubString {

    public static int MaxSubString(String s){
        String subString="";
        int n = s.length();
        int res = 0;//用于比较与end-start大小
        int start=0,end=0;//两，个标志位
        Set<Character> set=new HashSet<>();//set元素不重复
        //if块是从set里删除元素，else块是往set里添加元素，添加一个元素，end++,删除一个元素，start++
        while(start<n && end<n){//循环开始先走else块，因为开始set中没有元素
            if(set.contains(s.charAt(end))){//集合中包含end标志位的元素
                set.remove(s.charAt(start++));//删除start元素，并将start+1,移动到下个字符
            }else{
                set.add(s.charAt(end++));//向set添加一个元素，同是end标志位移动到下个字符
                res=Math.max(res,end-start);//每次循环比较res与end-start，取较大值，循环完毕res就是最长无重复子串长度
            }
        }
        return res;
   }
    public static void main(String[] args) {

       System.out.println(MaxSubString("aaabbcdeee"));
    }
}
