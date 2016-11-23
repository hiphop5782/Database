package example;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam12_TableDelete {
	public static void main(String[] args) {
		String command = "테이블삭제(test)";
		String regex = "^테이블삭제\\((\\w+)\\)$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(command);
		if(m.find()){
			String filename = m.group(1)+".json";
			String rootFolder = "tableExample";
			File table = new File(rootFolder, filename);
			if(table.exists()){
				table.delete();
				System.out.println("테이블 삭제 완료");
			}else{
				System.out.println("테이블이 존재하지 않습니다.");
			}
		}
	}
}
