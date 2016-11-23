package example;

import java.io.File;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class Exam13_jackson_streaming1 {
	public static void main(String[] args) throws Exception{
		JsonFactory factory = new JsonFactory();
		JsonGenerator generator = factory.createGenerator(new File("tableExample/simple.json"), JsonEncoding.UTF8);
		
		generator.writeStartArray();												//[
		generator.writeStartObject();												//	{
		generator.writeStringField("name", "ȫ�浿");						//		"name":"ȫ�浿"
		generator.writeNumberField("age", 30);							//		"age":30
		generator.writeEndObject();												//	}
		generator.writeEndArray();													//]
		generator.close();																	//save
	}
}
