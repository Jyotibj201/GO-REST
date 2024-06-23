package REST_TestScripts;

import java.io.IOException;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import GenericUtils.ExcelUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetSingleUserDetails implements EndPoints {
	ExcelUtility excel=new ExcelUtility();
	@Test
	public void fetchSingleUserDetails() throws IOException {
			int  userId=6978669;
		Response resp = RestAssured.given()
		
		.auth().oauth2(bearerTocken)
		//.contentType(ContentType.JSON)
		.when().get("https://gorest.co.in/public/v2/users"+userId);
		

		resp.then()
		//.contentType(ContentType.JSON)
		.statusCode(200).log().all().time(Matchers.lessThan(8000L));

	}
}
