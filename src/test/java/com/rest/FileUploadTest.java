package com.rest;
import io.qameta.allure.Allure;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
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
        public static String generatedRoomId;
        public static String sellerId;//
        public static String roomName;// class-level variable
        private String payload;
        private Response response;
        @BeforeClass
        public void setUp() {
            requestSpec = ApiUtils.getRequestSpec("admin");
            responseSpec = ApiUtils.getResponseSpec();
        }


        @Test
        public void testDSRCreation() throws IOException {
            Allure.step("Prepare request payload");
            String payload = Jsonutils.getJsonPayload("src/test/resources/CreateDSRpayload.json");
            Allure.step("Send POST request to create DSR");
            Response response = given()
                    .spec(requestSpec)
                    .body(payload)
                    .when()
                    .post("v1/api/opportunity/rooms")
                    .then()
                    .spec(responseSpec)
                    .body("result.deleted", equalTo(false))
                    .body("result.status", equalTo("DRAFT"))
                    .body("result.buyers",empty())
                    .body("result.blocks", empty())
                    .body("result.entity_type",equalTo("OPPORTUNITY"))
                    .body("result.entity_id",equalTo("684fd8e49a55a50394c163db"))
                    .log().all()
                    .extract()
                    .response();
            Allure.step("Validate response and extract IDs");
            // 🔑 Assign to class-level variables
            roomName = response.path("result.name");
            sellerId = response.path("result.sellers[0].id");
            generatedRoomId = response.path("result.id");

            System.out.println("Generated Room ID: " + generatedRoomId);
            System.out.println("Room Name: " + roomName);
            System.out.println("Seller ID: " + sellerId);

            // 🔑 Validate dynamic values with SoftAssert
            softAssert.assertNotNull(roomName, "Room name should not be null");
            softAssert.assertNotNull(sellerId, "Seller ID should not be null");
            softAssert.assertNotNull(generatedRoomId, "Room ID should not be null");

            // 🔑 Trigger assertion evaluation
            softAssert.assertAll();
        }

        @Test(priority = 1, dependsOnMethods = {"testDSRCreation"})
        public void updateDSRName() throws IOException {
            String payload = Jsonutils.getJsonPayload("src/test/resources/CreateDSRpayload.json");
            payload = payload.replace("DYNAMIC_ROOM_NAME", DSRName);
            given().spec(requestSpec).body(payload).put("v1/api/opportunity/rooms/" + generatedRoomId)
                    .then().spec(responseSpec).log().all().extract().response();
            roomName = response.path("result.name");
            sellerId = response.path("result.sellers[0].id");
            generatedRoomId = response.path("result.id");

            System.out.println("Generated Room ID: " + generatedRoomId);
            System.out.println("Room Name: " + roomName);
            System.out.println("Seller ID: " + sellerId);

            // 🔑 Validate dynamic values with SoftAssert
            softAssert.assertNotNull(roomName, "Room name should not be null");
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


