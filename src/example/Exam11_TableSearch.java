package example;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam11_TableSearch {
	public static void main(String[] args) {
		String command = "���̺�˻�(simple)";
		String regex = "^���̺�˻�\\((\\w+)\\)$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(command);
		
		if(m.find()){
			String filename = m.group(1)+".json";
			System.out.println("filename = "+filename);
			
			String rootFolder = "tableExample";
			File file = new File(rootFolder, filename);
			if(file.exists()){
				System.out.println(file.getPath()+"��(��) ã�ҽ��ϴ�.");
			}else{
				System.out.println(file.getPath()+"��(��) ã�� �� �����ϴ�.");
			}
		}
	}
}







