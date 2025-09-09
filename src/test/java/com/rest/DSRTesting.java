package com.rest;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ApiUtils;
import utils.Jsonutils;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DSRTesting {

    private String payload;
    private Response response;
    private RequestSpecification requestSpec;
    private ResponseSpecification responseSpec;

    @BeforeClass
    public void setUp() {
        requestSpec = ApiUtils.getRequestSpec("admin");
        responseSpec = ApiUtils.getResponseSpec();
    }

    @Given("I have a valid DSR payload")
    public void iHaveAValidDSRPayload() throws Exception {
        payload = Jsonutils.getJsonPayload("src/main/resources/CreateDSRpayload.json");
    }

    @When("I send a POST request to create a new DSR room")
    public void iSendAPOSTRequestToCreateADSR() {
        response = given()
                .spec(requestSpec)
                .body(payload)
                .when()
                .post("v1/api/opportunity/rooms");
    }

    @Then("I should receive a successful response")
    public void iShouldReceiveASuccessfulResponse() {
        response.then()
                .spec(responseSpec)
                .body("result.status", equalTo("DRAFT"));
    }
}
