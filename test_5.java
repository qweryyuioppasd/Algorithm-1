package 项目;
import java.util.Scanner;
/*
 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 */

public class test_5 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		Solution_5 s1=new Solution_5();
		System.out.print(s1.reverse(x));
	}

}

class Solution_5{
    public int reverse(int x) {
    	int r=0;
    	int digit;
    	while(x!=0) {
    		digit=x%10;
    		x=x/10;
    		if (r>Integer.MAX_VALUE / 10 ||(r==Integer.MAX_VALUE/10 && digit>7)) 
    			return 0;
            if (r<Integer.MIN_VALUE / 10 ||(r==Integer.MIN_VALUE/10 && digit<-8)) 
            	return 0;
    		r=r*10+digit;
    	}
    	return r;
    }
}