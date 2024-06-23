package REST_TestScripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.ResponseSpecificationImpl.HamcrestAssertionClosure;
import io.restassured.response.Response;

public class SimpleTest implements EndPoints{

	@Test
	public void simpleGetMethod() {
//		JSONObject json=new JSONObject();
		RestAssured.given()
		.auth().oauth2(bearerTocken)
		.contentType(ContentType.JSON)
		
		.when()
		.get("https://gorest.co.in/public/v2/users")
		 
		.then()
		.assertThat().contentType(ContentType.JSON).statusCode(200).log().all();
				
	}
}
