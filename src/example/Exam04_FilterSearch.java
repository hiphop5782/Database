package example;

import java.util.regex.Pattern;

public class Exam04_FilterSearch {
	public static void main(String[] args) {
		//���� �˻��� %�� ����˻� ����, ���ڴ� ><=! ��밡��, ���� true/false
		String command1 = "�˻�(simple)[\"id\":\"admin\",\"money\":=1000]";
		String regex = "^�˻�\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\]$";
		System.out.println(command1);
		System.out.println(regex);
		boolean flag;
		flag = Pattern.matches(regex, command1);
		System.out.println(flag);
	}
}
