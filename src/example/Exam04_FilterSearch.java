package example;

import java.util.regex.Pattern;

public class Exam04_FilterSearch {
	public static void main(String[] args) {
		//문자 검색은 %로 유사검색 가능, 숫자는 ><=! 사용가능, 논리는 true/false
		String command1 = "검색(simple)[\"id\":\"admin\",\"money\":=1000]";
		String regex = "^검색\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\]$";
		System.out.println(command1);
		System.out.println(regex);
		boolean flag;
		flag = Pattern.matches(regex, command1);
		System.out.println(flag);
	}
}
