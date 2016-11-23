package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Exam14_jackson_databind1 {
	public static void main(String[] args) throws Exception{
		File file = new File("tableExample/simple.json");
		InputStream is = new FileInputStream(file);
		byte[] by = new byte[(int)file.length()];
		is.read(by);
		Map<String, String> map = new HashMap<>();
		ObjectMapper mapper = new ObjectMapper();
		map = mapper.readValue(by, HashMap.class);
	}
}
