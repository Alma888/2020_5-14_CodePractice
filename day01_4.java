//Math 的round方法是四舍五入的意思，
//round的进位是向数轴的右方向进位的，而不是按照数的绝对值进行四舍五入的
//round是四舍五入,注意负数5是舍的,例如:Math.round(1.5)值是2,Math.round(-1.5)值是-1;
//floor就是直接去掉小数保留整数,即如果参数是正数则小数部分全舍,参数是负数则小数部分全入。
// 例如:Math.floor(2.6)的值是2.0,Math.floor(-2.1)的值是-3.0

public class day01_4 {
    public static void main(String[] args) {
        System.out.println(Math.round(11.5));  //12
        System.out.println(Math.round(0.399)); //0
        System.out.println(Math.round(0.499)); //0
        System.out.println(Math.round(0.5));   //1
        System.out.println(Math.round(0.51));  //1
        System.out.println(Math.round(0.6));   //1
        System.out.println("=====================");
        System.out.println(Math.round(-0.6));  //-1
        System.out.println(Math.round(-0.51)); //-1
        System.out.println(Math.round(-0.5));  //0 负数5是舍去的，但是数轴负数5左侧的eg:-0.51 就是入的，-1
        System.out.println(Math.round(-0.499));//0
        System.out.println(Math.round(-0.399));//0
        System.out.println(Math.round(-11.5)); //-11
        System.out.println(Math.floor(1.5));//1.0
        System.out.println(Math.floor(-1.5));//-2.0


    }
}
