package example;

import java.util.regex.Pattern;

public class Exam03_FilterList {
	public static void main(String[] args) {
		String command1 = "목록(simple)";
		String regex = "^목록\\(\\w+\\)$";
		System.out.println(command1);
		System.out.println(regex);
		boolean flag;
		flag = Pattern.matches(regex, command1);
		System.out.println(flag);
	}
}
