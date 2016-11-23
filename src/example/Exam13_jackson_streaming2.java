package example;

import java.io.File;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class Exam13_jackson_streaming2 {
	public static void main(String[] args) throws Exception{
		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(new File("tableExample/simple.json"));
		StringBuffer buffer = new StringBuffer();
		while(true){
			JsonToken token = parser.nextToken();
		
			if(token.equals(JsonToken.FIELD_NAME)){
				buffer.append(parser.getCurrentName());
			}else if(token.equals(JsonToken.VALUE_STRING)){
				buffer.append(parser.getValueAsString());
			}else if(token.equals(JsonToken.VALUE_NUMBER_INT)){
				buffer.append(parser.getNumberValue());
			}else if(token.equals(JsonToken.VALUE_NUMBER_FLOAT)){
				buffer.append(parser.getFloatValue());
			}else{
				buffer.append(token.asString());
			}
			//System.out.println(parser.getCurrentName());
			//System.out.print(token.asString());
			if(token == JsonToken.END_ARRAY) break;
		}
		System.out.println("=== [result] ===");
		System.out.println(buffer.toString());
		parser.close();
	}
}
