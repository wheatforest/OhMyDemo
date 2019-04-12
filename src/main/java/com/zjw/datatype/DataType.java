package com.zjw.datatype;

public class DataType {

    /**
    Java 是 -种强类型语言。这就意味着必须为每一个变量声明一种类型: 在 Java 中，共有 8
    种基本类型（ primitive type ), 其中有 4 种整型、2 种浮点类型、 1 种用于表示 Unicode 编码的字符
    单元的字符类型 char (请参见论述 char 类型的章节） 和 1 种用于表示真值的 boolean 类型
     */

    public static void main(String[] args) {
        //java中有能够表示任意精度的算术包，称为大数值
        //在java中，类型字节长度与平台无关，并且没有无符号类型

    /*
     整型表示没有小数的数值，可以是负数

     四种整型*/

        //byte和short用于特定的应用场合，如底层的文件处理或者控制占用存储空间量的大数组

        //byte 1字节 -128到127

        byte aByte=-128;
        //二进制位10000000，取反加一加负号
        byte bByte=127;
        //二进制为01111111
        //可以看出 两者只差一
        System.out.println("aByte:"+(bByte+1));
        //结果为aByte;

        //short 2字节 -32768到32767
        short aShort=-32768;
        //二进制为1000 0000 0000 0000
        short bShort=32767;
        //二进制为0111 1111 1111 1111
//为何负数的绝对值比正数大？
//因为第一位为符号位，正数为0，值即绝对值，负数首位为1，其值为取反加一。


        //int 4字节 大概超过正负20亿

        int aInt;

        //long 8字节
        //长整型常量后添加l或者L.
        long aLong=11111111L;


        // 进制
        //二进制,添加0b或者0B;
        int i=0b1111;
        //八进制 前面添加0；
        int j=0111111;
        //十六进制 前面添加0x
        int k=0xABCD;

        //从java7开始，可以添加下划线；只是为了方便读，编译器会去掉。
        int a=0b1_000_000;
        int b=0111_222;



    //浮点数
          //浮点数表示有小数部分的数值，在java中有两种浮点类型

        //float:4字节；很少使用,除非数据库需要单精度或者大数组用于节省空间；需要在后面加上f

        float c=111.111111111f;

        //double:8字节，默认为双精度，也可以在后缀添加d或者D表示

        double d=222.222222222222222222222d;

        //用于表示出错的三种类型

        //正无穷大 一个正整数除以0的结果为正无穷大
         //Double.POSITIVE_INFINITY;
        //负无穷大，一个负整数除以0的结果为负无穷大
        //Double.NEGATIVE_INFINITY;
        //计算0/0或者负数的平方根结果为NaN.
        //不能这样检测一个特定值为Double.NaN
        //if(0/0 == Double.NaN);
        //因为所有"非数值"的值都认为是不相同的，可以使用Double.isNaN方法
        if(Double.isNaN(0/0)){

        }
        /**
         * 浮点数不适合于无法接受舍入误差的金融计算中，如果不允许存在舍入误差，应当使用BigDecimal类
         *
         * */
        System.out.println(2.0-1.1);
        //结果为0.89999999,因为浮点数采用二进制系统表示，无法精确表示分数1/10


 //char类型
 //char类型的字面量值要用单括号括起来，
 char x='A';
 //char类型的值可以表示为十六进制值,使用\u可以用十六进制表示char,\u03C0表示希腊字母π
        //public static void main(String\u005B\u0050 args)


        //特殊的转义序列

        //退格 \b
        //制表 \t
        // 换行 \n
        // 回车 \r
        // 双引号 \"
        //单引号 \'
        // 反斜杠 \\


//boolean类型

        //有true和false两个值，整型和布尔值之间不能相互转换
        //在C++中 if(x=0)为false,而这java中，这个测试将不能通过编译


    }





}
