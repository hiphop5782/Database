package example;

import java.util.regex.Pattern;

public class Exam05_FilterDelete {
	public static void main(String[] args) {
		String command1 = "삭제(simple)[\"id\":\"admin\",\"money\":=1000]";
		String regex = "^삭제\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\]$";
		System.out.println(command1);
		System.out.println(regex);
		boolean flag;
		flag = Pattern.matches(regex, command1);
		System.out.println(flag);
	}
}
