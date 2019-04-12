package com.zjw;

public class Arrays {

    //数组
    public static void main(String[] args) {


        int[] a;

        int[] b = new int[100];
//
//        for (int i = 0; i < 100; i++) {
//            b[i] = i;
//        }
        int c[];

        //创建数字数组时，初始化为0，boolean数组初始化为false,对象数组初始化为null
        //创建了数组后，就不能改变其大小，所以通常使用是ArrayList
        //collection必须是一个数组或者一个实现了Iterable接口的类对象
        for (int i : b) {
            System.out.println(b[i]);
        }
        System.out.println(java.util.Arrays.toString(b));
        //[1,2,3,4]


        //简单写法，数组的大小就是初始值的数
        int[] smallprimes={2,3,5,4,22};

        //匿名数组
      smallprimes=  new int[]{2,3,3,4,4};

      //允许将数组变量拷贝给另一个数组变量，两个变量应用的是一个数组

        //如果希望拷贝到新数组使用Arrays.copyOf(),通常用来增加数组大小
        smallprimes= java.util.Arrays.copyOf(smallprimes,2*smallprimes.length);

        //arrays自带的排序是快速排序
        java.util.Arrays.sort(smallprimes);

        //将数组的所有值设置为v,适合将空数组初始化
        java.util.Arrays.fill(smallprimes,1);

        //equals如果两个数组的大小和元素都相同，返回true

        //多维数组
        int[][] ab={
                {1111},
                {2222}
        };
    }
}
