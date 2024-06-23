package REST_TestScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Get implements EndPoints{

	@Test
	public void getAllUserDetails() {
		//RestAssured is a Interface - Request Specification
		RestAssured.given()
		.contentType(ContentType.JSON)
		
		//Authorization using Bearere Token
		.auth().oauth2(bearerTocken)
		//Request Sender Base URL("https://gorest.co.in") + end point: "/public/v2/users"
		.get(baseURL+createAnewUser) // "https://gorest.co.in/public/v2/users"
		
		
		//Response is a Interface - Validate response
		.then()
		.contentType(ContentType.JSON)
		.statusCode(200)
		.time(Matchers.lessThan(8000L))
		.log().all();
		
	}
}
