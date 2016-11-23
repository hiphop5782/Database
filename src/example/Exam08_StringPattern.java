package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam08_StringPattern {
	public static void main(String[] args) {
		// �̹��� �±׸� �����ϱ� ���� ���Խ�.
		Pattern pattern  =  Pattern.compile("<img[^>]*src=[\"']?([^>\"']+)[\"']?[^>]*>");

		// ������ ����.
		String content = "Hello~ My name is blabla.. It's my picture. <img src=\"name1.jpg\"><br><img src=\"name2.jpg\">";

		// ���� �߿��� �̹��� �±׸� ã�ƶ�!
		Matcher match = pattern.matcher(content);

		while(match.find()){ // �̹��� �±׸� ã�Ҵٸ�,,
			System.out.println(match.group(0));
			System.out.println(match.group(1));
		}
	}
}
