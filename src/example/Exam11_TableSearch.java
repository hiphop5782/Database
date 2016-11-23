package example;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam11_TableSearch {
	public static void main(String[] args) {
		String command = "테이블검색(simple)";
		String regex = "^테이블검색\\((\\w+)\\)$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(command);
		
		if(m.find()){
			String filename = m.group(1)+".json";
			System.out.println("filename = "+filename);
			
			String rootFolder = "tableExample";
			File file = new File(rootFolder, filename);
			if(file.exists()){
				System.out.println(file.getPath()+"을(를) 찾았습니다.");
			}else{
				System.out.println(file.getPath()+"을(를) 찾을 수 없습니다.");
			}
		}
	}
}







