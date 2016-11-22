package example;

import java.util.regex.Pattern;

public class Exam02_FilteringInsert {
	public static void main(String[] args) {
		String command1 = "[1,2,3,4,5]";
		String regex1 = "^\\[((\\d,)?)*\\d\\]$";
		System.out.println(command1);
		System.out.println(regex1);
		boolean flag;
		flag = Pattern.matches(regex1, command1);
		System.out.println(flag);
		System.out.println("============================================================");
		String command2 = "추가(simple)[\"id\":\"test\",\"pw\":\"master\",\"money\":1000]";
		String regex2 = "^(추가)\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|\\d+|(true|false))),)*\"\\w+\":(\"\\w+\"|[0-9]+|(true|false))\\]$";
		System.out.println(command2);
		System.out.println(regex2);
		flag = Pattern.matches(regex2, command2);
		System.out.println(flag);
	}
}
