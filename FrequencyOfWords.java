/*
题目描述
写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，然后输出输入字符串中该字母的出现次数。不区分大小写。

输入描述:
第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。

输出描述:
输出输入字符串中含有该字符的个数。不区分大小写。

笔记：大写字母比小写字母小32位数：a - A = 32；
*/

import java.util.Scanner;
 public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int sum = 0;
		int checkNum = (int)str2.charAt(0);
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == checkNum || 
					str1.charAt(i) == checkNum - 32 || 
					str1.charAt(i) == checkNum + 32) {
				sum++;
			}
		}
		sc.close();
		System.out.println(sum);
	}

}
