package utils;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import requestServices.AddUserRequest;
import responseServices.AddUserResponse;
import responseServices.UpdateUserResponse;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class UpdateUserUsingPut {
    @Test
    public void updateUser() {
        baseURI = "https://reqres.in/";
        AddUserRequest updateUser = new AddUserRequest();
        updateUser.setName("priya");
        updateUser.setJob("devloper");
        Response updatedUser = given()
                .header("Content-Type", "application/json")
                .body(updateUser)
                .when().put("/api/users/2")
                .then().statusCode(200).extract().response();
        System.out.println(updatedUser.asString());
        UpdateUserResponse userResponse = updatedUser.as(UpdateUserResponse.class);
        System.out.println(userResponse.getUpdatedAt());
    }
}
