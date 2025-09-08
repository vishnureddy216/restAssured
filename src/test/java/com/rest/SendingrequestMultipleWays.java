//package com.rest;
//
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.builder.ResponseSpecBuilder;
//import io.restassured.filter.log.LogDetail;
//import io.restassured.http.ContentType;
//import io.restassured.specification.RequestSpecification;
//import io.restassured.specification.ResponseSpecification;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
//
//public class SendingrequestMultipleWays {
//    ResponseSpecification responseSpecification;
//    RequestSpecification requestSpecification;
//    @BeforeClass
//    public void beforeClass(){
//        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
//        requestSpecBuilder.setBaseUri("https://gdemo.gtmdev.xyz");
//        requestSpecBuilder.addHeader("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..jNXU-j3jZC-OQiF0M6fN0A.wtyeq1urkLLqh2psCbAylWNQJzf6zbi-sfgg3EyJU-e5Je3RZLzp4cw5CwA0pHFhnvEY-D8TajZOkAQlUm9ORLJ3ghrHJ0yOgChl_KMtmMmlXwion_FSlmrwLVMGrx7WCf3nCpNdlNMp0DjwIyROtPvzgEQAc4V8T6ayaHtGJvifYfhhhdk1vP6517OV8_BWhBs0pJ0hL06FvX6APEkJOOOamljyA0wlbEPYfOytCWCG1ChK3J4UCU4kU27nJZEJj4nGxCPQ68bbcYGNrwUrPLi4S2y3IJoqCLx54rL5OF04MCN5UabVC6ARmg45IFBkSeKQbgOiuZIE6xaw-U0HRg.nzo7QIMSNNpdL2nKSVFieQ");
//        requestSpecification= requestSpecBuilder.build();
//
//        ResponseSpecBuilder responseSpecBuilder= new ResponseSpecBuilder()
//                .expectStatusCode(200)
////                .expectContentType(ContentType.JSON)
//                .log(LogDetail.ALL);
//        responseSpecification =responseSpecBuilder.build();
//    }
//    @Test
//    public void createDSRPayload(){
//        File file= new File("src/main/resources/CreateDSRpayload.json");
//        given()
//                .spec(requestSpecification)
//                .contentType("application/json")
//                .body(file)
//                .when().post("/v1/api/opportunity/rooms")
//                .then()
//                .statusCode(200).body("result.status", equalTo("DRAFT"));
//    }
//}
