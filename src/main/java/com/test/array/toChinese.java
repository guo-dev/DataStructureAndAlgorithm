package com.test.array;

/**
 * @author guoqinglin
 * @create 2020-05-06-23:15
 */
public class toChinese {
    private static String toChinese(String str) {
        String[] s1 = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
        String[] s2 = { "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千" };
        String result = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int num = str.charAt(i) - '0';
            if (i != n - 1 && num != 0) {
                result += s1[num] + s2[n - 2 - i];
            } else {
                result += s1[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(toChinese("123"));
    }
}
