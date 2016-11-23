package com.db.console;

import java.util.regex.Pattern;

public class CommandChecker {
	private static String[] filterString = new String[]{
			"^���̺���;?$",
			"^���̺�(����|�˻�|����)\\((\\w+)\\);?$",
			"^(�߰�)\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|\\d+|(true|false))),)*\"\\w+\":(\"\\w+\"|[0-9]+|(true|false))\\];?$",
			"^���\\(\\w+\\);?$",
			"^�˻�\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\];?$",
			"^����\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\];?$",
			"^����\\(\\w+\\)\\{((\"\\w+\":(\"\\w+\"|\\d+|(true|false))),)*\"\\w+\":(\"\\w+\"|[0-9]+|(true|false))\\}\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\];?$",
			"^����$"
	};
	private static String[] endString = new String[]{";","]",")"};
	
	public static boolean isCorrectCommand(String command){
		for(String f : filterString){
			if(Pattern.matches(f, command)) return true;
		}
		return false;
	}
	
	public static boolean isNullString(String command){
		command = command.trim();
		return command != null && command.equals("");
	}
	
	public static boolean isEndOfCommand(String command){
		command = command.trim();
		for(String end : endString){
			if(command.endsWith(end)) return true;
		}
		return false;
	}
}
