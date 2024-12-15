 package com.thetestingacademy.ex02_RestAssuredBasic.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
//import jdk.jfr.Description;
import org.testng.annotations.Test;

public class APITesting008_GET_Non_BDDStyle
{
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    //here we r reusing these variables
    //@Description("+ve testcase with valid data ")

    @Test
    public void test_GET_NonBDDStyle_Positive()
    {
        //rest assured interface
        String pin_code = "388620";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pin_code);

        response = r.when().log().all().get();

        vr = response.then()
        .log().all().statusCode(200);

    }

    //@Description("-ve testcase with negative i/p")
    @Test
    public void test_GET_NonBDDStyle_Negative1()
    {
        String pin_code = "-1";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all().statusCode(404);


    }

    //@Description("-ve testcase with string i/p")
    @Test
    public void test_GET_NonBDDStyle_Negative2()
    {
        String pin_code = "Ashwini";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all().statusCode(404);


    }

    //@Description("-ve test case with long")
    @Test
    public void test_GET_NonBDDStyle_Negative3()
    {
        String pin_code = "133333333333333333333333333333333333333";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pin_code);

        response = r.when().log().all().get();

        vr = response.then()
                .log().all().statusCode(404);


    }


}
//Wy we need testng
 //Reporting, parallel exe, Annonations support, priority, multithreading, eassy integration plugins
 //open source, better than junit framework, DDT, parameterized, listeners

 //how to write test in testng
 //1. Create a method and add ur logic in that method
 //2. Mark that method as test
 //3. Add required annotations like
 //Description, group, priority, enabled
