package exam03;

import java.util.Scanner;

import mystak.MyStackArrayList;

public class Exam03_Question05 {
	public static void main(String[] args) {
		MyStackArrayList<Character> stackArrayList = new MyStackArrayList<>();
		Scanner inputScanner = new Scanner(System.in);
		String brackets = inputScanner.nextLine();
		char[] ch = brackets.toCharArray();
		boolean flag = true;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '[' || ch[i] == '(' || ch[i] == '{') {
				stackArrayList.push(ch[i]);
			} else if (ch[i] == ']' && stackArrayList.peek() == '[') {
				stackArrayList.pop();
				flag = true;
			} else if (ch[i] == ')' && stackArrayList.peek() == '(') {
				stackArrayList.pop();
			} else if (ch[i] == '}' && stackArrayList.peek() == '{') {
				stackArrayList.pop();
			} else {
				flag = false;
				break;
			}

		}

		System.out.println(flag);

	}
}
