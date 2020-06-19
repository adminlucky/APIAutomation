package Dashboards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DashboardsRequests {
	
	public static RequestSpecification httpRequest;
	public static Response response;
	
	public static RequestSpecification cookie(){
		return RestAssured.given().contentType(ContentType.JSON)
		.cookie("JSESSIONID", "A30B66D33338BC55A981BFBC1E0857FE");	
	}
	
	/*@Test
	public static void postRequest(){
		
		response = cookie()
	            .body("{\"accessTo\": \"selected\", \"title\": \"Test API Dashboard 0104\", \"description\": \"Test dashboard for API testing 0104\", \"accessToSelectedUser\": \"true\", \"selectedUsers\": "
	            		+ "\"[\""
	            + "{\"id\": \"313393152\", \"fullname\": \"Kim Smart\", \"isSelect\": \"true\" \"}\","
	            					+ "{\" \"id\": \"70352902\", \"fullname\": \"Rhonda Sweatt\", \"isSelect\": \"true\" \"}\","
	            					+ "{\" \"id\": \"100040726\", \"fullname\": \"Shari Little\", \"isSelect\": \"true\" \"}\""
	            					+ "\"]\""
           		+ "\"}\"")
	            .post("https://sat.propertyware.com/pw/api/v/dashboards");
	            
			System.out.println("Response body is : "+ response.getBody().asString());
			System.out.println("****************************************End of Post method******************************************");
	}*/
	/*@Test
	public static void postDashboard(){
		
		List<Map<String,Object>> dashboards = new ArrayList<>();
		Map<String, Object> userDetails1 = new HashMap<>();
		userDetails1.put("id", "313393152");
		userDetails1.put("fullname", "Kim Smart");
		//userDetails1.put("isSelect", "true");
		dashboards.add(userDetails1);
		
		Map<String, Object> userDetails2 = new HashMap<>();
		userDetails2.put("id", "70352902");
		userDetails2.put("fullname", "Rhonda Sweatt");
		//userDetails2.put("isSelect", "false");
		dashboards.add(userDetails2);
		
		Map<String, Object> userDetails3 = new HashMap<>();
		userDetails3.put("id", "100040726");
		userDetails3.put("fullname", "Shari Little");
		//userDetails3.put("isSelect", "true");
		dashboards.add(userDetails3);
		
		Map<String, Object> dashboardDetails = new HashMap<>();
		
		dashboardDetails.put("accessTo", "selected");
		dashboardDetails.put("title", "PW Dashboard");
		dashboardDetails.put("description", "PW dashboard for tasks");
		dashboardDetails.put("selectedUsers", dashboards);
		
		response = cookie()
	            .body(dashboardDetails)
	            .post("https://sat.propertyware.com/pw/api/v/dashboards");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			System.out.println("****************************************End of Post method******************************************");
	}*/
	
	/*@Test
	public static void deleteDashboard(){
		response = cookie()
	              .delete("https://sat.propertyware.com/pw/api/v/dashboards/735313920");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}
	
	
	//Not working
	@Test
	public static void putDashboardAsDefault(){
		response = cookie()
	              .put("https://sat.propertyware.com/pw/api/v/dashboards/default/735248389");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}*/
	
	
	//Not working
	@Test
	public static void putDashboard(){
		response = cookie()
	              .put("https://sat.propertyware.com/pw/api/v/dashboards/735313920");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}
	/*
	@Test
	public static void getDashboards(){
		response = cookie()
	              .get("https://sat.propertyware.com/pw/api/v/dashboards/735281155?refresh=false");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}
	@Test
	public static void putDashlet(){
		response = cookie()
				.body("{\"title\": \"Bills with work orders Line chart\", \"chartType\": \"Line.swf\", "
	            		+ "\"chartXEntity\": \"billSplit\", \"chartXField\": \"bill.vendor.companyName\","
	            		+ "\"chartXDataType\": \"text\", \"chartXLabel\": \"Vendor Name\", "
	            		+ "\"chartYFunction\": \"count\", \"dashboardID\": \"733609984\","
	            		+ "\"id\": \"852754432\", \"reportID\": \"1777500205\"}")
	              .put("https://sat.propertyware.com/pw/api/v/dashlets/");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}
	@Test
	public static void deleteDashlet(){
		response = cookie()
				  .delete("https://sat.propertyware.com/pw/api/v/dashlets/852754432");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}
	@Test
	public static void getDashlet(){
		response = cookie()
				  .get("https://sat.propertyware.com/pw/api/v/dashlets/850984960?showAllRecords=true");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}
	
	@Test
	public static void putDashlet(){
		response = cookie()
				.body("{\"title\": \"Prospect records\", \"chartType\": \"Column2D.swf\", "
	            		+ "\"chartXEntity\": \"prospect\", \"chartXField\": \"type\","
	            		+ "\"chartXDataType\": \"text\", \"chartXLabel\": \"Type\", "
	            		+ "\"chartYFunction\": \"sum\", \"dashboardID\": \"733609984\","
	            		+ "\"chartYField\": \"numberBedrooms\", \"chartYLabel\": \"Bedrooms\", \"reportID\": \"1777500275\"}")
	              .post("https://sat.propertyware.com/pw/api/v/dashlets/");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}*/
	
}
