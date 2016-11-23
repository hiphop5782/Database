package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam08_StringPattern {
	public static void main(String[] args) {
		// 이미지 태그를 추출하기 위한 정규식.
		Pattern pattern  =  Pattern.compile("<img[^>]*src=[\"']?([^>\"']+)[\"']?[^>]*>");

		// 추출할 내용.
		String content = "Hello~ My name is blabla.. It's my picture. <img src=\"name1.jpg\"><br><img src=\"name2.jpg\">";

		// 내용 중에서 이미지 태그를 찾아라!
		Matcher match = pattern.matcher(content);

		while(match.find()){ // 이미지 태그를 찾았다면,,
			System.out.println(match.group(0));
			System.out.println(match.group(1));
		}
	}
}
