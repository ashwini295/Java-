package com.thetestingacademy.ex02_RestAssuredBasic.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITestng010_BDDStyle
{
    @Description
    @Test
    public void test_Post_BDDStyle()
    {
        //TC>100->NBDD or BDD

        //url,body,header

        String payload = "{\n" +
                "\"username\":\"admin\",\n"+
                "\"password\":\"password123\"\n"+
                "}";

        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);


    }
}
