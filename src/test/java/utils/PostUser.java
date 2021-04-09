package utils;

import io.restassured.response.Response;
import org.junit.runner.Request;
import org.testng.annotations.Test;
import requestServices.AddUserRequest;
import responseServices.AddUserResponse;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PostUser {
    @Test
    public void createUser() {
        baseURI = "https://reqres.in/";
        AddUserRequest addUser = new AddUserRequest();
        addUser.setName("priya");
        addUser.setJob("tester");
        Response responseSingleUser = given()
                .header("Content-Type", "application/json")
                .body(addUser)
                .when().post("/api/users")
                .then().statusCode(201).extract().response();
        System.out.println(responseSingleUser.asString());
        AddUserResponse userResponse = responseSingleUser.as(AddUserResponse.class);
        System.out.println(userResponse.getId());
    }
}