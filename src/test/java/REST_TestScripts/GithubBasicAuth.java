package REST_TestScripts;

import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GithubBasicAuth {

	@Test
	public void githubBasicAuthUsingEmailPwd() {
		RestAssured.given()
		.auth().basic("jyotibj201@gmail.com", "Gouravva1996@")
		
		.when().get("https://github.com/Jyotibj201/GO-REST")
		
		.then().statusCode(200)
		.time(Matchers.lessThan(20000L))
		.contentType(ContentType.HTML)
		.log().all();
	}
}
