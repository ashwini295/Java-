package com.thetestingacademy.ex02_RestAssuredBasic.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITestng009_NonBDDStyle
{
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description("Verify post req +ve")
    @Test
    public void test_post_NonBDDStyle()
    {
        String payload = "{\n" +
                "\"username\":\"admin\",\n"+
                "\"password\":\"password123\"\n"+
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        response = r.when().log().all().post();

        vr= response.then().log().all().statusCode(200);


    }
}
