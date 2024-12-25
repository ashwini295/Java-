package com.thetestingacademy.ex04_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;

public class APITesting021_RestAssured_Assertions
{
    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;
    @Test
    public void test_POST()
    {
        String payload_POST = "{\n" +
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

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com/");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.body(payload_POST).log().all();

        Response response = rs.when().post();

        //Get validatable response to perform validation
        vr= response.then().log().all();
        vr.statusCode(200);

        //Rest Assured-> import org.hamcrest.Matchers
        //Matchers.Equalto()

        vr.body("bookingid",Matchers.notNullValue());
        //here s is the pathwhich we eed to find in json_path_finder
        vr.body("booking.firstname",Matchers.equalTo("Jim"));
        vr.body("booking.lastname",Matchers.equalTo("Brown"));
        vr.body("booking.depositpaid",Matchers.equalTo(true));

    }
}
//Hamcrets has some limited methods
//1. equalTo()-> checks if value is equal to expected value
//2. hasItem()-> Verifies if an array contains a specific item
//3. hasSize()-> Checks the size of collection in the response
//4. containString()-> Validates if a string contains a specific substring
//5. is(nullValue())-> Checks if a field is null

