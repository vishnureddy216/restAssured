package com.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ApiUtils;
import utils.Jsonutils;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class FileUploadTest {
    String DSRName = "User_" + System.currentTimeMillis();
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;

    @BeforeClass
    public void setUp() {
        requestSpec = ApiUtils.getRequestSpec();
        responseSpec = ApiUtils.getResponseSpec();
    }

    @Test(groups = { "sanity" })
    public void testDSRCreation() throws IOException {
        //String DSRName = "User_" + System.currentTimeMillis();
        String payload = Jsonutils.getJsonPayload("src/main/resources/CreateDSRpayload.json");
        //String postBody= "{\"name\":\""+DSRName+"\",\"entity_id\":\"684fd8e49a55a50394c163db\",\"company_domain\":null,\"entity_logo\":null,\"cloneable\":null,\"room_id\":null,\"entity_type\":\"OPPORTUNITY\",\"content_type\":null,\"show_team_section\":true,\"enable_mutual_action_plan\":null,\"enable_content\":true,\"enable_meeting\":false,\"enable_messaging\":true,\"share_type\":\"\",\"share_tool\":null,\"template_id\":null,\"enable_collaboration\":null,\"updateAssociation\":false}}";
        given().spec(requestSpec)
                .body(payload)
                .when()
                .post("v1/api/opportunity/rooms")
                .then().spec(responseSpec).body("result.status",equalTo("DRAFT"));

    }

}
