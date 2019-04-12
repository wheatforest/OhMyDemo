package com.zjw;

public class Strings {
    //字符串

    public static void main(String[] args) {


        //子串
        String greeting = "Hello";
        String s = greeting.substring(0, 3);


        //拼接
        String ex = "ss";
        String rx = "saa";
        String mess = ex + rx;

        //当一个字符串与非字符串拼接时，会被转换成字符串，即使是个java对象，因为所有java都有toSTring方法


        //判断字符串相等，不能使用==,因为虽然字符串是共享的，但是是对字符串常量是如此，而对subSTring等产生的并不是统一地址
        //应当使用equals方法，如果不区分大小写应当使用equalsIgnoreCase;

        //检查空串和Null串
        String sss = "";
        if (sss == null || sss.length()==0) {
//首先判断是否为空，然后使用短路法，防止空指针异常
        }


        //构建字符串,使用STring直接拼接会产生过多的string，占用空间和时间
        StringBuilder sb=new StringBuilder();
        sb.append("ss");
        sb.append(1);
        sb.toString();
        //与StringBuffer相比，速度较快，但是不能支持多线程改变字符串，所有在单线程中，适合使用STringBuilder;

    }

}
