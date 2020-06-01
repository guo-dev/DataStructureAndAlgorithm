package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author guoqinglin
 * @create 2020-05-29-8:24
 */
//遍历Map
public class mapT {


    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "张三");
        map.put("2", "李四");
        map.put("3", "王五");
        map.put("4", "赵六");

        //通过map.keySet遍历key和value
//        System.out.println("通过map.keySet遍历key和value");
//        for(String key : map.keySet()){
//            System.out.println("Key="+key+" and value="+map.get(key));
//        }

        //通过map.entrySet遍历key和value
//        System.out.println("通过map.entrySet遍历key和value");
//        for(Map.Entry<String,String> entry : map.entrySet()){
//            System.out.println("Key=" + entry.getKey() + " and value = " + entry.getValue());
//        }

        //通过Iterator迭代器遍历Map.entrySet
//        System.out.println("通过map.entrySet使用迭代器遍历key和value");
//        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            System.out.println("Key = " + entry.getKey() + " and value = " + entry.getValue());
//        }

        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }

    }
}
