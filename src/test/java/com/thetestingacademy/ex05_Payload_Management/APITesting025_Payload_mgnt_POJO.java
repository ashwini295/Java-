package com.thetestingacademy.ex05_Payload_Management;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class APITesting025_Payload_mgnt_POJO
{
    //how to handle the payload in the Rest Assured?
    //1.String(TC<100)
    //2.Map(100<TC<500)
    //Class and Object(pojo)+Third GSON, Jackson API-Framework

    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;
    int bookingid;

    @Test
    public void test_POST() {
       /* String payload_POST = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";*/

       /* Map<String,Object> jsonBodyUsingMap = new LinkedHashMap();
        jsonBodyUsingMap.put("firstname","Jim");
        jsonBodyUsingMap.put("lastname","Brown");
        jsonBodyUsingMap.put("totalprice",123);
        jsonBodyUsingMap.put("depositpaid",true);

        Map<String,Object> bookingDateMap = new LinkedHashMap<>();
        bookingDateMap.put("checkin","2018-01-01");
        bookingDateMap.put("checkout","2019-01-01");

        jsonBodyUsingMap.put("bookingdates",bookingDateMap);
        jsonBodyUsingMap.put("additionalneeds","Breakfast");

        System.out.println(jsonBodyUsingMap);
        //Map->JSON
        //for converting this map to json we need to add one library GSON/jacson*/


        //POJO->plain old java obj
        //normal class->encapsulation->(private getter setter)

        Booking booking = new Booking();
        booking.setFirstname("Jim");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast");

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");
        booking.setBookingDates(bookingdates);

        System.out.println(booking);


        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com/");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.body(booking).log().all();

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
//for creating the automatic pojo we use https://www.jsonschema2pojo.org/tis site
//for knowing how much classes/map need to create use https://jsoncrack.com/editor this sie
//for finding the json path use use this site https://jsonpathfinder.com/