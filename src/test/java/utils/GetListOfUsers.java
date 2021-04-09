package utils;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import responseServices.GetDataAndSupportForListOfUsers;
import responseServices.GetSingleUserResponse;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetListOfUsers {
    @Test
    public void getAllUsers() {
        baseURI = "https://reqres.in/";
        Response responseListOfUsers = given()
                .header("Content-Type", "application/json")
                .when().get("/api/users?page=2")
                .then().statusCode(200).extract().response();

        System.out.println(responseListOfUsers.asString());
        GetDataAndSupportForListOfUsers allUsers = responseListOfUsers.as(GetDataAndSupportForListOfUsers.class);
        GetSingleUserResponse.Data[] allUsersData = allUsers.getData();
        String userFirstName= allUsers.getPage();
        System.out.println(userFirstName);
           String firstName =  allUsersData[0].getFirstName();
        System.out.println(firstName);
    }
}