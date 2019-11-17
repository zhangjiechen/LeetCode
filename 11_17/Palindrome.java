/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
*/
import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你需要判断是否是回文数的数字:");
        int x = in.nextInt();
        System.out.println(isPalindrome(x));
    }
   public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false; //负数或者0 10 100 等不符合
        int revertNum = 0;
        while (x > revertNum) {
            revertNum = revertNum * 10 + x % 10; //求出反转数  0+x的个位数  x的个位数乘以10+x的十位数  以此类推
            x /= 10;
        }
        return x == revertNum || x == revertNum / 10;
    }
}