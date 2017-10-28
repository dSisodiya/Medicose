package in.co.util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
 
	private static  ObjectMapper objMapper;
	static {
		objMapper=new ObjectMapper();
	}
public static String JavaToJson(Object obj){
	String jsonString="";
	try {
		jsonString=objMapper.writeValueAsString(obj);
	} catch (JsonProcessingException e) {
		System.out.println("exception in JsonUtil.."+e.getMessage());
	}
	return jsonString;
}
}
