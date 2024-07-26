package 项目;
import java.util.*;
import java.util.HashMap;

/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。
*/


public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		sc.close();
		int array1[]=new int[] {2,11,7,5};
		Solution s1=new Solution();
		System.out.print(Arrays.toString(s1.twoSum(array1, target)));
	}
}

class Solution {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>h1=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++) {
        	if(h1.containsKey(target-nums[i])) {
        		return new int[] {h1.get(target-nums[i]),i};
        	}
        	h1.put(nums[i],i);
        }
        return new int[0];
    }
}
