package com.testing.pojo;

import org.testng.annotations.Test;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class RestApi {
	@Test
	public void RestApiReq() throws JsonProcessingException{
	try {
		Description desc1=new Description("RestApi created","Ishu","ishu123@gmail.com");
		
		ObjectMapper mapper=new ObjectMapper();
		String string = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(desc1);
		System.out.println(string);
		
		//deserialization
		Description value = mapper.readValue(string,Description.class);
		System.out.println(value.getDescription());
		System.out.println(value.getEmail());
		System.out.println(value);
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

}
}