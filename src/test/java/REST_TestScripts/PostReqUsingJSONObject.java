package REST_TestScripts;


import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtils.EndPoints;
import GenericUtils.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReqUsingJSONObject implements EndPoints {
JavaUtility javaUtils=new JavaUtility();
	
	@Test
	public void postMethodReqUsingJSONObject() {
		JSONObject json=new JSONObject();
		json.put("name", "Jyoti"+javaUtils.getRandomNum());
		json.put("email", "Jyoti"+javaUtils.getRandomNum()+"@yopmail.com");
		json.put("gender", "female");
		json.put("status", "active");
		
	Response resp = RestAssured.given()
		.auth().oauth2(bearerTocken)
		.contentType(ContentType.JSON)
		.body(json)
		
		.when()
		.post("https://gorest.co.in/public/v2/users/");
	
		resp.then().assertThat()
		.statusCode(201).contentType(ContentType.JSON).log().all()
		.time(Matchers.lessThan(8000L));
		
		
	}
}
