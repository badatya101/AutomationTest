package com.page;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CoinMapAPI {
	
	CommonUtilClass commonUtilClass=new CommonUtilClass();
	RequestSpecification spec;
	Response res;
	public void hitBaseUsi() {
		spec= RestAssured.given().relaxedHTTPSValidation();
		spec.baseUri(commonUtilClass.getDataFromProperties("baseUri"));
	}
	
	public void getApi() {
		 res= spec.get(commonUtilClass.getDataFromProperties("getVenues"));
	}
	
	public  void verifyRespoce() {
		//System.out.println(res.prettyPrint());
		//List ls=res.body().jsonPath().getList("venues.category");
		ArrayList ls=res.body().jsonPath().get(commonUtilClass.getDataFromProperties("venuesCategory"));
		Set set= new HashSet(ls);
		System.err.println("size: "+set.size()+" , Categories: ");
		System.out.println(set);
		List<Map> l=res.body().jsonPath().get(commonUtilClass.getDataFromProperties("venuesFindAllFood"));
		System.err.println("Name -- Geolocation");
		for(Map mp:l) {
		System.out.print(mp.get("name")+"  -- ");
		System.out.println(mp.get(commonUtilClass.getDataFromProperties("geolocationDegrees")));
		}

		}

}
