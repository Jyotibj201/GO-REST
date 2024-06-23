package REST_TestScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Delete implements EndPoints{
	
	@Test
	public void deleteAnExistingResource() {
		int userId=6978981;
		
		RestAssured.given()
		.auth().oauth2(bearerTocken)
		
		.when()
		.delete(deleteUser+userId)
		
		.then().assertThat().statusCode(204)
		//.contentType(ContentType.JSON)
		.time(Matchers.lessThan(20000L))
		.log().all();
		
	}
	
	

}
