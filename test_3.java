package 项目;
import java.util.Scanner;

public class test_3 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		Solution_3 s1=new Solution_3();
		System.out.print(s1.climbStairs(x));
	}
}

class Solution_3 {
    public int climbStairs(int n) {
    	int p=0, q=0, r=1;
    	for(int i=1;i<=n;i++) {
    		p=q;
    		q=r;
    		r=p+q;
    	}
    	return r;
    }
}