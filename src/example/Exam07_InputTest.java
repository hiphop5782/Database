package example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exam07_InputTest {
	public static void main(String[] args) {
		while(true){
			String command = work();
			System.out.println("command = "+command);
			boolean flag = filter(command);
			System.out.println("filter = "+flag);
			if(flag) execute(command);
			else error(command);
			log(command);
		}
	}
	
	public static boolean filter(String command){
		String[] regex = new String[]{
				"^(추가)\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|\\d+|(true|false))),)*\"\\w+\":(\"\\w+\"|[0-9]+|(true|false))\\]$",
				"^목록\\(\\w+\\)$",
				"^검색\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\]$",
				"^삭제\\(\\w+\\)\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\]$",
				"^수정\\(\\w+\\)\\{((\"\\w+\":(\"\\w+\"|\\d+|(true|false))),)*\"\\w+\":(\"\\w+\"|[0-9]+|(true|false))\\}\\[((\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false))),)?(\"\\w+\":(\"\\w+\"|(>|<|>=|<=|!=|=)\\d+|(true|false)))\\]$"
		};
		boolean flag = false;
		for(String r : regex){
			if(Pattern.matches(r, command)){
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static void execute(String command){
		
	}
	
	public static void error(String command){
		
	}
	
	public static void log(String command){
		
	}
	
	public static String work(){
		Scanner reader = new Scanner(System.in);
		StringBuffer buffer = new StringBuffer();
		int rowCount = 1;
		int emptyRowCount = 0;
		while(true){
			System.out.print(rowCount>1?rowCount+" ":"sql> ");
			String command = reader.nextLine();
			buffer.append(command);
			rowCount++;
			if(command.endsWith("]")||command.endsWith(";")){
				break;
			}else if(command.trim().equals("")){
				if(++emptyRowCount > 1){
					emptyRowCount = 0;
					rowCount = 1;
					continue;
				}
			}
		}
		return buffer.toString();
	}
}
