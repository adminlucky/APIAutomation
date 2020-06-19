package Notes;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getNotes {
	
	@Test
	public void readNotes(){
		
		final String uri = "https://sit.propertyware.com/pw/api/v/tasks/tags";
		final RequestSpecification basicAuth = RestAssured.given().auth().preemptive().basic("sam@texasrenters.com", "Realpage12");
		Response response = basicAuth.accept(ContentType.JSON).get(uri);
		
		System.out.println("Response code from server : "+response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(), 200);
		//https://www.youtube.com/watch?v=PAyGma2OMFo
		
		/*RestAssured.authentication = RestAssured.preemptive().basic("sam@texasrenters.com", "Realpage12");
		String resBody = RestAssured.given()
		.get("https://sit.propertyware.com/pw/api/v/tasks/templates/").getBody().asString();
		System.out.println("Response code from server : "+resBody);*/
		
		/*RestAssured.baseURI="https://sit.propertyware.com/pw/api/v/tasks/tags";
		PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
		authScheme.setUserName("sam@texasrenters.com");
		authScheme.setPassword("Realpage12");
		RestAssured.authentication = authScheme;
		RequestSpecification httpRequest=RestAssured.given();
		Response res=httpRequest.request(Method.GET);
		//Response res=httpRequest.request(Method.GET,"/Hyderabad");
		
		int stCode=res.getStatusCode();
		System.out.println("Status code: " +stCode);
		//Assert.assertEquals(200, stCode);
		String resString=res.getBody().asString();
		System.out.println("Response body: " +resString);*/
	}
}
