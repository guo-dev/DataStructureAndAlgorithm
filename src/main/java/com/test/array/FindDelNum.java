package com.test.array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guoqinglin
 * @create 2020-06-29-17:25
 */
public class FindDelNum {
    public int FindDelNum (int[] oldArr) {
        int res = 0;
        for (int origin: oldArr)
        {
            res ^= origin;
        }
        int[] newArr = removeByIndex(oldArr,0);//按索引删除
        for (int result: newArr)
        {
            res ^= result;
        }
        return res;
    }



    public static int[] removeByIndex(int[] oldArr, int index) {
        // new 一个bai List
        List<Object> list = new ArrayList<Object>();
        // 循环迭代，du把数组放进List里面
        for (int i : oldArr) {
            list.add(i);
        }
        // 根据索引删除
        list.remove(index);
        // 重新new 一个数组
        int[] newArr = new int[list.size()];
        // 把List里面的集合全部添加到数组里面
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = ((Integer) list.get(i)).intValue();
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] oldArr = { 1, 2, 3, 4, 5 ,6,7,8,9};
        FindDelNum odd = new FindDelNum();
        System.out.println(odd.FindDelNum(oldArr));
    }
}
