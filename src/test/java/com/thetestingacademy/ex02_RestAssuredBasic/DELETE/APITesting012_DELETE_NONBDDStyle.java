package com.thetestingacademy.ex02_RestAssuredBasic.DELETE;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012_DELETE_NONBDDStyle
{
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    @Description
    public void Delete_non_Bdd()
    {


            String token = "token=7635c4fe438cefa";
            String booking_id = "609";
            String Authorization = "Basic YWRtaW46cGFzc3dvcmQxMjM=";

            String payloadput = "{\n" +
                    "    \"firstname\" : \"Jim\",\n" +
                    "    \"lastname\" : \"Brown\",\n" +
                    "    \"totalprice\" : 111,\n" +
                    "    \"depositpaid\" : true,\n" +
                    "    \"bookingdates\" : {\n" +
                    "        \"checkin\" : \"2018-01-01\",\n" +
                    "        \"checkout\" : \"2019-01-01\"\n" +
                    "    },\n" +
                    "    \"additionalneeds\" : \"Breakfast\"\n" +
                    "}";

            r = RestAssured.given();
            r.baseUri("https://restful-booker.herokuapp.com/");
            r.basePath("/booking/" + booking_id);
            r.contentType(ContentType.JSON);
            r.cookie("token", token);
            r.headers("Authorization", Authorization);
            r.body(payloadput).log().all();

            response = r.when().delete();

            vr = response.then().log().all();
            vr.statusCode(201);





    }


}
