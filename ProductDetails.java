package com.qa.pojo;

import java.io.IOException;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.xml.XmlSerializer;

public class ProductDetails {
	public static void main(String[] args) throws IOException {
		//pojo to json
		JsonSerializer serializer = JsonSerializer.DEFAULT_READABLE;
		String sellerName[]= {"xiaomi","samsung"};
		Product product=new Product("Samsung","purple",30000, sellerName);
		String string = serializer.serialize(product);
		System.out.println(string);
	
	//pojo to xml
	XmlSerializer defaultNsSqReadable = XmlSerializer.DEFAULT_NS_SQ_READABLE;
	String serialize = defaultNsSqReadable.serialize(product);
	System.out.println(serialize);
	
	//pojo to html;
	HtmlSerializer defaultSqReadable = HtmlSerializer.DEFAULT_SQ_READABLE;
	String serialize2 = defaultSqReadable.serialize(product);
	System.out.println(serialize2);
	
	//deserialization
	JsonParser parser = JsonParser.DEFAULT;
	String jsonval="{\r\n"
			+ "			\"color\": \"purple\",\r\n"
			+ "			\"name\": \"Samsung\",\r\n"
			+ "			\"price\": 30000,\r\n"
			+ "			\"sellerName\": [\r\n"
			+ "				\"xiaomi\",\r\n"
			+ "				\"samsung\"\r\n"
			+ "			]\r\n"
			+ "		}";
	try {
		Product product2 = parser.parse(jsonval,Product.class);
		System.out.println(product2.getColor());
		System.out.println(product2.getSellerName());
		System.out.println(product2);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}