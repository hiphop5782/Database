package example;

import java.util.regex.Pattern;

public class Exam06_FilterUpdate {
	public static void main(String[] args) {
		String command1 = "수정(simple){\"pw\":\"password\"}[\"id\":\"admin\",\"money\":=1000]";
		String regex = "^수정\\(\\w+\\)\\{((\"\\w+\":(\"\\w+\"|\\d+|(true|false))),)*\"\\w+\":(\"\\w+\"|[0-9]+|(true|false))\\}\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\]$";
		System.out.println(command1);
		System.out.println(regex);
		boolean flag;
		flag = Pattern.matches(regex, command1);
		System.out.println(flag);
	}
}
