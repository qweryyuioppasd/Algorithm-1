package 项目;
import java.util.Scanner;
import java.util.HashMap;

/* 
 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 
子串
 的长度。

示例 1:

输入: s = "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: s = "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */

public class test_4 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		Solution_4 s1=new Solution_4();
		System.out.print(s1.lengthOfLongestSubstring(s));
	}
}

class Solution_4{
    public int lengthOfLongestSubstring(String s) {
    	if (s == null || s.length() == 0) return 0;
    	//字符串为空
    	
    	//非空
        HashMap<Character, Integer>h1= new HashMap<>();
        int max = 0;
        int start = 0;
        for (int i= 0;i< s.length();i++) {
            char currentChar = s.charAt(i);
            if (h1.containsKey(currentChar)) {
                start = Math.max(start, h1.get(currentChar) + 1);
            }
            h1.put(currentChar,i);
            max = Math.max(max, i-start+1);
        }
        return max;
    }
}