package REST_TestScripts;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import GenericUtils.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Post implements EndPoints{
	JavaUtility javaUtils=new JavaUtility();
	@Test
	public void postReqUsingJSONObject() {
	
		JSONObject json=new JSONObject();
		json.put("name", "Jyoti"+javaUtils.getRandomNum());
		json.put("email", "Jyoti"+javaUtils.getRandomNum()+"@yopmail.com");
		json.put("gender", "female");
		json.put("status", "active");
		RestAssured.given()
		.auth().oauth2(bearerTocken)
		.contentType(ContentType.JSON)
		.body(json)
		
		.when()
		.post(createAnewUser)
		
		.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON)
		//.time(Matchers.lessThanOrEqualTo(15000L))
		.log().all();
		
	}

}
