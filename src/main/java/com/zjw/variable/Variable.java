package com.zjw.variable;

public class Variable {
    private final static int I=5;
    //称为类常量，可以直接用类名调用，如果是public可以被其他类调用。比如Variable.I,虽然java
    //中存在const保留字，但是并没有使用，还是使用final static
    public static void main(String[] args) {
        //java中的变量可以存在字母和数值，包括"_"，但不能是空格
        int i_j = 1;
        int _ij = 1;
        //不可以使用保留字作为变量名
        //可以在一行声明,但是不提倡
        int i,j;
        //在java中变量必须被初始化才能使用，否则会报错，声明和初始化必须同时使用
        i=3;

        System.out.println(i);


        //使用final标识常量，习惯上常量名使用大写，final标记的值不能被修改
        final long ING=4L;
      //  ING=3L;报错



    }

}

