package com.thetestingacademy.ex04_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class APITesting024_RestAssured_TestNG_Assertions
{
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

        //Get validatable response to perform validation
        vr = response.then().log().all();
        vr.statusCode(200);

        //Rest Assured-> import org.hamcrest.Matchers
        //Matchers.Equalto()

        vr.body("bookingid", Matchers.notNullValue());
        //here s is the pat hwhich we eed to find in json_path_finder
        vr.body("booking.firstname", Matchers.equalTo("Jim"));
        vr.body("booking.lastname", Matchers.equalTo("Brown"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));


        //TestNG Assertions

        bookingid = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        Assert.assertNotNull("bookingid");
        Assert.assertEquals(firstname, "Jim");
        Assert.assertEquals(lastname, "Brown");


        //3rd party AssertJ assertion

        assertThat(bookingid).isNotNull().isNotZero().isPositive();
        assertThat(firstname).isEqualTo("Jim").isNotNull().isNotBlank();
        assertThat(lastname).isEqualTo("Brown").isNotNull().isNotBlank();

    }

}
