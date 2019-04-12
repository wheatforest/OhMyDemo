package com.zjw;

public class Operators {

    public static void main(String[] args) {
        //java运算符 + - * / %,其中%指求余，只能整数使用
        //整数被0除会产生一个异常，浮点数被0除会得到无穷大或者NaN
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(1.0 / 0);
//返回为Infinity


        //Math类
//计算一个数值的平方根
        double x=4;
        double y=Math.sqrt(x);
        System.out.println(y);

        //幂运算
        double z=Math.pow(x,2);

        //Math.floorMod总会得到0到11之间的结果，而不会出现负数，除非对于负除数
        Math.floorMod(-3+5,12);

        double pi=Math.PI;
        double e=Math.E;

        //如果运算符得到一个值与左侧操作数的类型不同，将发生强制类型转换
       //等价于 x=x+4;
        int i=1;
        i+=3.5; //这种情况下，结果还是int,相当于(int)(x+3.5)

        //--n 与n-- 在表达式中，--n会先减一再运算，n--会先先运算在减一



        //位运算符


        //运算符优先级


    }





}
