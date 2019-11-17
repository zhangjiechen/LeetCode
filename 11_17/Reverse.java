/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

*/

import java.util.*;
public class Reverse {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你需要倒转的数字:");
        int x = in.nextInt();
        System.out.println(reverse(x));
    }
    public static long reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = 10 * res + x % 10;
            x /= 10;
        }
        return (res > Math.pow(2,31)-1 || res < (-1)*Math.pow(2,31)) ? 0 : res;
    }

 }
    
