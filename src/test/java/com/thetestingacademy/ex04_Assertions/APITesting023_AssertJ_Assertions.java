package com.thetestingacademy.ex04_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class APITesting023_AssertJ_Assertions
{
    //AssertJ is a powerful thrid party library for java that provides fluent and expressive
    //asserions, making test code more readable and maintainable

    //AssertJ provides assertions for many data types:
    //String: startsWith(), endsWith(), contains()
    //Collections: hasSize(), contains(), isEmpty()
    //Numbers: isPositive(), isGreaterThan, isBetween()
    //Dates: isBefore(), isAfter(), isEqualTo()

    //1st u need to add it in pom.xml
    //u need to  import static org.assertj.core.api.Assertions.*;

    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;
    int bookingid;

    @Test
    public void test_POST() {
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

        bookingid = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        assertThat(bookingid).isNotNull().isNotZero().isPositive();
        assertThat(firstname).isEqualTo("Jim").isNotNull().isNotBlank();
        assertThat(lastname).isEqualTo("Brown").isNotNull().isNotBlank();






    }



}
