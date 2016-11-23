package example;

import java.util.regex.Pattern;

public class Exam01_FilteringCommand {
	public static void main(String[] args) {
		String command1 = "�߰�(simple)[\"id\":\"test\",\"pw\":\"master\",\"money\":1000]";
		String command2 = "���(simple)";
		String command3 = "�˻�(simple)[\"id\":\"test\"";
		String command4 = "����(simple)[\"id\":\"test\"";
		String command5 = "����(simple){\"money\":5000}[\"id\":\"test\"]";
		String regex = "^(�߰�|���|�˻�|����|����)\\(\\w+\\)(\\[\\w+\\])?$";
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
