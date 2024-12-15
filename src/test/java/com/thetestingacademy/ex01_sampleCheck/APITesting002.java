package com.thetestingacademy.ex01_sampleCheck;

import io.restassured.RestAssured;

public class APITesting002
{
    public static void main(String[] args)
    {
        //Gherkin Syntax
        //Given()-> url,header,auth,body
        //When()->http method->grt/put/post/patch/delete
        //Then()->validation->200 ok,firstname==Ashwini


        //Full URL-> https://api.zippopotam.us/IN/560003
        //Base URI-> https://api.zippopotam.us
        //path urI-> /IN/560003

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/560003")
                .when()
                    .get()
                .then().log().all().statusCode(200);


    }
}
