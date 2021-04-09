package utils;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import responseServices.GetDataAndSupportDetails;
import responseServices.GetSingleUserResponse;


public class GetSingleUser {
    @Test
    public void getSingleUser() {
   baseURI ="https://reqres.in/";
        Response responseSingleUser = given()
                .header("Content-Type", "application/json")
                .when().get("/api/users/3")
                .then().statusCode(200).extract().response();

        System.out.println(responseSingleUser.asString());

        GetDataAndSupportDetails user =  responseSingleUser.as(GetDataAndSupportDetails.class);

        String userFirstName= user.getData().getFirstName();
        String userLastName= user.getData().getLastName();
        String supportText= user.getSupport().getText();
        System.out.println("FirstName "+userFirstName+ " LastName " +userLastName+" support text: "+supportText);
        Assert.assertEquals(responseSingleUser.statusCode(),200);
    }

    }



