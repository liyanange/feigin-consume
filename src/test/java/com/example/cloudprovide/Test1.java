package com.example.cloudprovide;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        String c="D:\\maxtest";
        File a= new File("D:\\maxtest");
        a.mkdirs();
        for(int i =0 ;i < 10000; i++){
            c="D:\\maxtest";
            c = c+"\\"+i;
            File d = new File(c);
            d.mkdirs();
        }
    }
}
