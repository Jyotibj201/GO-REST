package REST_TestScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import GenericUtils.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PatchReqUsingParams implements EndPoints{
	JavaUtility javautils=new JavaUtility();
	int UserId= 6978669;
	@Test
	public void updateUserQueryParams() {
		RestAssured.given()
		.auth().oauth2(bearerTocken)
		//.contentType(ContentType.JSON)
		.queryParam("name", "restAuures Update"+javautils.getRandomNum())

		.when().patch(baseURL+getOneUserDetails+UserId)

		.then()
		//.contentType(ContentType.JSON)
		.statusCode(200).log().all().time(Matchers.lessThan(8000L));


	}



}
