package com.test.sort;

import java.io.File;

/**
 * @author guoqinglin
 * @create 2020-03-17-10:53
 */
public class GetTxtFile {


    public static void GetTxtFile(File file) {
        File[] listFiles = file.listFiles();
        for (File lf : listFiles) {
            if (lf.isFile()) {
                if (lf.getName().endsWith(".txt")) {
                    System.out.println(lf);
                }
            } else {
                if (lf.isDirectory()) {
                    GetTxtFile(lf);
                }
            }
        }
    }


public static void main(String[] args) {
    File file = new File("D:\\java");
    GetTxtFile(file);
    }

}
















