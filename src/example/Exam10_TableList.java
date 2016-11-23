package example;

import java.io.File;
import java.util.regex.Pattern;

public class Exam10_TableList {
	public static void main(String[] args) {
		String command = "테이블목록";
		String regex = "^테이블목록$";
		
		boolean flag = Pattern.matches(regex, command);
		
		if(!flag) return;
		
		File folder = new File("tableExample");
		if(!folder.exists()){
			System.out.println("폴더가 없습니다.");
			return;
		}
		
		File[] filelist = folder.listFiles();
		for(File file : filelist){
			System.out.println(file.getPath());
		}
	}
}
