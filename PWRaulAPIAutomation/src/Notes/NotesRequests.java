package Notes;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class NotesRequests {
	
	public static RequestSpecification httpRequest;
	public static Response response;
	
	public static RequestSpecification cookie(){
		return RestAssured.given().contentType(ContentType.JSON)
		.cookie("JSESSIONID", "CAA0111473A5F72E42B6586B042F6528");	
	}
	
	@Test(priority = 4)
	public static void getNotes(){
		
		response = cookie()
		//.get("https://sit.propertyware.com/pw/api/v/tasks/tags");
		//.get("https://sit.propertyware.com/pw/api/v/tasks/templates");
		//.get("https://sat.propertyware.com/pw/api/v/notes/256903557");
		//.get("https://sit.propertyware.com/pw/api/v/conversations/0/10/A");
		.get("https://sit.propertyware.com/pw/api/v/notes");
		
		System.out.println("Response body of Get Request is : "+ response.getBody().asString());
		System.out.println("****************************************End of get method******************************************");
	}
	
	/*@Test
	public static void postNote(){
		
		response = cookie()
	            .body("{\"subject\": \"Note abc\", \"body\": \"Body of the SAT note by post request 0329\", \"private\": \"true\"}")
	            .post("https://sat.propertyware.com/pw/api/v/notes");
	            
			System.out.println("Response body is : "+ response.getBody().asString());
			System.out.println("****************************************End of Post method******************************************");
	}*/
	
	/*@Test
	public static void putNote(){
		
			response = cookie()
	            .body("{\"id\": 2417885186, \"subject\": \"Subject updated by Put request\", "
	            		+ "\"body\": \"Body of the note updated by Put request\", \"private\": \"false\"}")
	            .put("https://sat.propertyware.com/pw/api/v/notes");
	            
			System.out.println("Response body is : "+ response.getBody().asString());
			System.out.println("****************************************End of Put method******************************************");
	}*/
	
	/*@Test
	public static void deleteNote(){
		
			response = cookie()
	            .delete("https://sat.propertyware.com/pw/api/v/notes/233638050");
	            
			System.out.println("Response body is : "+ response.getBody().asString());
			Assert.assertTrue(response.getBody().asString().contains("Note is Deleted Sucessfully"));
			System.out.println("****************************************End of Delete method******************************************");
	}*/
}
