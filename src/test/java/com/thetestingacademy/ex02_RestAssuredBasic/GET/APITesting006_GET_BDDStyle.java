package com.thetestingacademy.ex02_RestAssuredBasic.GET;

import io.restassured.RestAssured;

public class APITesting006_GET_BDDStyle
{
    //Base, URL,
    public static void main(String[] args) {

        String pincode ="560016";

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()//log.all will log the all things
                .then().log().all().statusCode(200);

        pincode = "-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()//log.all will log the all things
                .then().log().all().statusCode(404);

        //TestNG rules
        //1.@annotations->@Test->it will mar a function as a testcase
        //2. make sure u add or create ur functions public void and starts with test
        //3. testng.xml->it contains info about which class to run which method to run
        //to create it we req plugin-intellij plugin





    }



}
