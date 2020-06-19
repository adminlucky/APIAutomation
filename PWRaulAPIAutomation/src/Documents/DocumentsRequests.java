package Documents;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DocumentsRequests 
{
	public static RequestSpecification httpRequest;
	public static Response response;
	
	public static RequestSpecification cookie(){
		return RestAssured.given().contentType(ContentType.JSON)
		.cookie("JSESSIONID", "44FA8876A4405011A252A4D7A67C4FF9");	
	}
	/*@Test
	public static void getDocuments(){
		response = cookie()
	              .get("https://sat.propertyware.com/pw/api/v/documents");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}*/
	@Test
	public static void postDocument(){
		response = cookie()
	              .post("https://sat.propertyware.com/pw/api/v/documents/Dumpster Policy 2015.pdf/No/No/No");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}
	/*@Test
	public static void deleteDocument(){
		response = cookie()
	              .delete("https://sat.propertyware.com/pw/api/v/documents/3086843924");
		
			System.out.println("Response status code: "+response.statusCode()+"\n"+ "Response body is : "+ response.getBody().asString());
			
	}*/
	
}
