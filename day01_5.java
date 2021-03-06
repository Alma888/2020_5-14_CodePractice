//统计回文
//“回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串。
//花花非常喜欢这种拥有 对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。
// 现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。你接受花花的请求，
// 帮助她寻找有多少种插入办法可以使新 串是一个回文串。如果字符串B插入的位置不同就考虑为不一样的办法。
// 例如： A = “aba”，B = “b”。
// 这里有4种把B插入A的办法：
// * 在A的第一个字母之前: "baba" 不是回文
// * 在第一个字母‘a’之后: "abba" 是回文
// * 在字母‘b’之后: "abba" 是回文
// * 在第二个字母'a'之后 "abab" 不是回文
//所以满足条件的答案为2

// 输入描述： 每组输入数据共两行。
// 第一行为字符串A 第二行为字符串B 字符串长度均小于100且只包含小写字母
// 输出描述： 输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数
// 示例1: 输入aba b输出2

//使用String类提供的方法就可解决
//【解题思路】：
//判断回文:这里我们首先将用户输入的字符串变为一个个的char，一个指针从开头向后遍历每个char的同时另
//一个指针从后向前遍历，当发现字符不相等时说明不是回文串。
//查找插入位置:知道如何判断回文后我们只需要将第二个字符串从第一个字符串第一个位置开始尝试插入直到
//判断回文的方法返回true时即找到插入位置

import java.util.Scanner;

public class day01_5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            int count=0;
            for(int i=0;i<=s1.length();i++){
                StringBuilder sb=new StringBuilder(s1);
                sb.insert(i,s2);
                if(isHuiwen(sb.toString())){
                    count++;
                }
            }
        System.out.println(count);
    }

    private static boolean isHuiwen(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
