package example;

import java.util.regex.Pattern;

public class Exam01_FilteringCommand {
	public static void main(String[] args) {
		String command1 = "추가(simple)[\"id\":\"test\",\"pw\":\"master\",\"money\":1000]";
		String command2 = "목록(simple)";
		String command3 = "검색(simple)[\"id\":\"test\"";
		String command4 = "삭제(simple)[\"id\":\"test\"";
		String command5 = "수정(simple){\"money\":5000}[\"id\":\"test\"]";
		String regex = "^(추가|목록|검색|삭제|수정)\\(\\w+\\)(\\[\\w+\\])?$";
		boolean flag;
		flag = Pattern.matches(regex, command1);
		System.out.println(flag);
		flag = Pattern.matches(regex, command2);
		System.out.println(flag);
		flag = Pattern.matches(regex, command3);
		System.out.println(flag);
		flag = Pattern.matches(regex, command4);
		System.out.println(flag);
		flag = Pattern.matches(regex, command5);
		System.out.println(flag);
	}
}
