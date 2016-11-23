package example;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam09_CreateTable {
	public static void main(String[] args) throws Exception{
		//��������Ʈ : http://sexy.pe.kr/tc/532
		//String command = "���̺����(simple)";
		Scanner reader = new Scanner(System.in);
		System.out.print("sql> ");
		String command = reader.nextLine();
		
		String regex1 = "^���̺����\\(\\w+\\)$";
		if(!Pattern.matches(regex1, command)){
			System.out.println("�߸��� ���");
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
				System.out.println("���̺� ���� �Ϸ�");
			}else{
				System.out.println("���̺��� �̹� �����մϴ�.");
			}
		}
		
		reader.close();
	}
}