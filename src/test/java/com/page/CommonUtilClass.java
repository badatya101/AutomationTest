package com.page;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class CommonUtilClass {

	public static Properties element;
	public static Properties testData;
	public static CommonUtilClass commonUtilClass;

	public String getDataFromProperties(String strElement){
		testData=new Properties();
		try {
			String strCurrentDir=System.getProperty("user.dir");
			String strProLocation=strCurrentDir+"\\PropertiesFiles\\SetData.properties";
			FileInputStream fis=new FileInputStream(strProLocation);
			testData.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return testData.getProperty(strElement);
	}

	public String getElementFromProperties(String strObject){
		try{
			element=new Properties();
			String strCurrentDir=System.getProperty("user.dir");
			String strProLocation=strCurrentDir+"\\PropertiesFiles\\Element.properties";
			FileInputStream fis=new FileInputStream(strProLocation);
			element.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return element.getProperty(strObject);
	}
	
	/*
	 * @Auther Abani
	 * This method will read the data from json array key value.
	*/
	public static String getJsonArrayData(String strKey,String strValue) throws IOException, ParseException {
		FileReader fileRead=new FileReader(".//src/test/resources/TestData/emp.json");
		JSONParser jsonParser=new JSONParser();
		Object ob=jsonParser.parse(fileRead);
		JSONObject emp=(JSONObject)ob;
		//strKey=(String)emp.get(strKey);
		System.out.println("Key is : "+strKey);
		JSONArray array=(JSONArray)emp.get(strKey);
		for(int i=0;i<array.size();i++) {
			JSONObject address=(JSONObject)array.get(i);
			//System.out.println(address);
			strValue=(String)address.get(strValue);
			if(strValue.equals("odsha")) {
				System.out.println("value is : "+strValue);
			}
		}
		return strKey+strValue;
	}
	
	/*
	 * @Auther Abani
	 * This method will read the data from json file key value per
	*/
	public static String getData(String strKey) throws IOException, ParseException {
		FileReader fileRead=new FileReader(".//src/test/resources/TestData/emp.json");
		JSONParser jsonParser=new JSONParser();
		Object ob=jsonParser.parse(fileRead);
		JSONObject emp=(JSONObject)ob;
		strKey=(String)emp.get(strKey);
		return strKey; 
	}

	/*public void scrollUntilelementFound(WebElement element) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
*/
	
}
