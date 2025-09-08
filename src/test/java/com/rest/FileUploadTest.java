package com.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.ApiUtils;
import utils.Jsonutils;
import java.io.IOException;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


    public class FileUploadTest {
        String DSRName = "User_" + System.currentTimeMillis();
        RequestSpecification requestSpec;
        ResponseSpecification responseSpec;
        SoftAssert softAssert = new SoftAssert();
        public static String generatedRoomId; // class-level variable

        @BeforeClass
        public void setUp() {
            requestSpec = ApiUtils.getRequestSpec();
            responseSpec = ApiUtils.getResponseSpec();
        }

        @Test
        public void testDSRCreation() throws IOException {
            String payload = Jsonutils.getJsonPayload("src/main/resources/CreateDSRpayload.json");

            Response response = given()
                    .spec(requestSpec)
                    .body(payload)
                    .when()
                    .post("v1/api/opportunity/rooms")
                    .then()
                    .spec(responseSpec)
                    .log().all()
                    .extract()
                    .response();

            // Assign to class-level variable
            generatedRoomId = response.path("result.id");
            System.out.println("Generated Room ID: " + generatedRoomId);

            softAssert.assertAll();
        }

        @Test(priority = 2, dependsOnMethods = {"testDSRCreation"})
        public void delete_Method() throws InterruptedException {
            System.out.println("Deleting Room ID: " + generatedRoomId);
            Thread.sleep(2000); // optional wait

            given().spec(requestSpec)
                    .when()
                    .delete("v1/api/opportunity/rooms/" + generatedRoomId)
                    .then()
                    .statusCode(202)
                    .body("result.status", equalTo(null));
        }
    }


