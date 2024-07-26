package 项目;
import java.util.Scanner;

/*
 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数
是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。
 */


public class test_2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		Solution_2 s1=new Solution_2();
		System.out.print(s1.isPalindrome(x));
	}
}

class Solution_2 {
    public boolean isPalindrome(int x) {
    	String s1=Integer.toString(x);
    	char array1[]=s1.toCharArray();
    	int ilength=array1.length-1;
    	for(int i=0;i<=ilength/2;i++) {
    		if(array1[i]!=array1[ilength-i]) {
    			return false;
    		}
    	}
    	return true;
    }
}