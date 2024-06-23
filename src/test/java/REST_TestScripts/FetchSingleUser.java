package REST_TestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class FetchSingleUser {
	int  userId=6977548;
	@Test
	public void fetchSingleUserData() {
		
		RestAssured.given()
		.when()
		.get("https://gorest.co.in/public/v2/users/"+userId)
		.then().contentType(ContentType.JSON).statusCode(200).log().all();
	}
}
