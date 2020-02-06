package EvolvingFramework;


import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class dummyAPIAutomation {
	
//@BeforeClass
//public void init() {
////RestAssured.baseURI = "http://dummy.restapiexample.com";
////System.out.println(RestAssured.baseURI);
//RestAssured.basePath = "api/v1";
//}
//@Test
//public void getEmployee()
//{
//	given().when().get("/employees").then().assertThat().statusCode(200).and().log().body();
//}

@Test
public void getEmployeeByID() {
	ValidatableResponse RS = given().when().get("/employee/1").then().assertThat().statusCode(200).and().log().body();
}
}
