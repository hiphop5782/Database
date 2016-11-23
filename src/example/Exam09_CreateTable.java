package example;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam09_CreateTable {
	public static void main(String[] args) throws Exception{
		//참조사이트 : http://sexy.pe.kr/tc/532
		//String command = "테이블생성(simple)";
		Scanner reader = new Scanner(System.in);
		System.out.print("sql> ");
		String command = reader.nextLine();
		
		String regex1 = "^테이블생성\\(\\w+\\)$";
		if(!Pattern.matches(regex1, command)){
			System.out.println("잘못된 명령");
			reader.close();
			return;
		}
		
		String regex2 = "\\((\\w+)\\)";
		boolean flag = Pattern.matches(regex2, command);
		Pattern p = Pattern.compile(regex2);
		Matcher m = p.matcher(command);
		
		if(m.find()){
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			String filename = m.group(1)+".json";
			File file = new File("tableExample"+File.separator+filename);
			System.out.println(file);
			System.out.println(file.exists());
			if(!file.exists()){
				file.createNewFile();
				System.out.println("테이블 생성 완료");
			}else{
				System.out.println("테이블이 이미 존재합니다.");
			}
		}
		
		reader.close();
	}
}