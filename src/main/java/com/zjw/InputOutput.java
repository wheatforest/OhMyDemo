package com.zjw;

import java.io.Console;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        //标准输入流system.in与Scanner相关联
        Scanner in=new Scanner(System.in);
        String name=in.next();
        String line = in.nextLine();
        int age=in.nextInt();
        double length=in.nextDouble();


        //因为Scanner是可见的，所有通常输入密码用的是Console类。
       Console console=System.console();
        String username=console.readLine("username:");
        char[] password=console.readPassword("userpassword:");
        //为了安全，将密码放在一个char[]中，并且应该在使用后将其覆盖


        //格式化输出
        System.out.printf("%8.2f", 333.33333);
        //先取小数点后2位，如果前面的多了，会全部显示，如果不足，会补足空格

        String message = String.format("Hello,%s,%f", "ss", 1);

        //原本有日期格式化的方法，现在推荐使用java.time



        //文件输入与输出,如果文件名包括反斜杠符号，在每个反斜杠钱再加一个额外的反斜杠
//在实践中，通常使用属性文件调用文件地址
        try {
            Scanner filein=new Scanner(Paths.get("c:\\my\\myfile.txt"),"UTF-8");
            PrintWriter out=new PrintWriter("myfile.txt","UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
