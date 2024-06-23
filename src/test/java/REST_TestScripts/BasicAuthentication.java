package REST_TestScripts;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import io.restassured.RestAssured;

public class BasicAuthentication implements EndPoints {
	String username="jyotisjogur@gmail.com";
	String password="Gouravva1996@";
	@Test
	public void basicAuthUsernamePwd() {

		RestAssured.given()
		.auth().basic(username, password)

		.when().get(basicAuth)

		.then().statusCode(200)
		.time(Matchers.lessThan(20000L))
		.log().all();
		System.out.println("User logged in Successfully..!");
		

	}

}
