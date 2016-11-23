package example;

import java.io.File;
import java.util.regex.Pattern;

public class Exam10_TableList {
	public static void main(String[] args) {
		String command = "���̺���";
		String regex = "^���̺���$";
		
		boolean flag = Pattern.matches(regex, command);
		
		if(!flag) return;
		
		File folder = new File("tableExample");
		if(!folder.exists()){
			System.out.println("������ �����ϴ�.");
			return;
		}
		
		File[] filelist = folder.listFiles();
		for(File file : filelist){
			System.out.println(file.getPath());
		}
	}
}
