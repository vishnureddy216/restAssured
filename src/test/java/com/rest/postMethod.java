//package com.rest;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.builder.ResponseSpecBuilder;
//import io.restassured.filter.log.LogDetail;
//import io.restassured.http.ContentType;
//import io.restassured.specification.RequestSpecification;
//import io.restassured.specification.ResponseSpecification;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.Matchers.hasItems;
//
//public class postMethod{
//    RequestSpecification requestSpecification;
//    ResponseSpecification responseSpecification;
//
//    @BeforeClass
//    public void beforeClass(){
//        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
//        requestSpecBuilder.setBaseUri("https://gdemo.gtmdev.xyz");
//        requestSpecBuilder.addHeader("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..jNXU-j3jZC-OQiF0M6fN0A.wtyeq1urkLLqh2psCbAylWNQJzf6zbi-sfgg3EyJU-e5Je3RZLzp4cw5CwA0pHFhnvEY-D8TajZOkAQlUm9ORLJ3ghrHJ0yOgChl_KMtmMmlXwion_FSlmrwLVMGrx7WCf3nCpNdlNMp0DjwIyROtPvzgEQAc4V8T6ayaHtGJvifYfhhhdk1vP6517OV8_BWhBs0pJ0hL06FvX6APEkJOOOamljyA0wlbEPYfOytCWCG1ChK3J4UCU4kU27nJZEJj4nGxCPQ68bbcYGNrwUrPLi4S2y3IJoqCLx54rL5OF04MCN5UabVC6ARmg45IFBkSeKQbgOiuZIE6xaw-U0HRg.nzo7QIMSNNpdL2nKSVFieQ");
//        requestSpecBuilder.setContentType(ContentType.JSON);
//
//        requestSpecification= requestSpecBuilder.build();
//
//        ResponseSpecBuilder responseSpecBuilder= new ResponseSpecBuilder()
//                .expectStatusCode(200)
//                .expectContentType(ContentType.JSON)
//                .log(LogDetail.ALL);
//        responseSpecification = responseSpecBuilder.build();
//    }
//
////    @Test
////    public void Post_Method1(){
////        String postBody = "{\"name\":\"RestAssured SetUp to test thed Room For Automation12,\",\"entity_id\":null,\"company_domain\":null,\"entity_logo\":null,\"cloneable\":true,\"room_id\":null,\"entity_type\":\"GENERIC\",\"content_type\":null,\"show_team_section\":true,\"updateAssociation\":false}";
////
////        given().spec(requestSpecification).body(postBody)
////                .when().post("/v1/api/opportunity/rooms")
////                .then().spec(responseSpecification).body("result.status", equalTo("DRAFT"));
////    }
//    @Test
//    public void Put_Method(){
////        String room_id="67d3f7c0d2c7bd5f0a8958a0";
//        String postBody="{\"name\":\"Updated to this name1\",\"cloneable\":true,\"room_id\":\"67d3f7c0d2c7bd5f0a8958a0\",\"entity_type\":\"GENERIC\",\"content_type\":\"WIDGETS\",\"show_team_section\":true,\"enable_mutual_action_plan\":true,\"enable_content\":true,\"enable_meeting\":true,\"enable_messaging\":true,\"enable_collaboration\":true,\"updateAssociation\":false,\"block_editor_settings\":{\"white_background_color_enabled\":true,\"page_background_color\":\"#f5f5f5ff\",\"enable_table_of_contents\":true,\"place_logo_banner\":true}}";
//        given().spec(requestSpecification)
//                .body(postBody)
//                .when()
//                .put("/v1/api/opportunity/rooms/67d3f7c0d2c7bd5f0a8958a0")
//                .then()
//                .spec(responseSpecification).body("result.name",equalTo("Updated to this name1"));
//
//    }
//  @Test
//    public void delete_Method(){
//        given().spec(requestSpecification)
//                .when()
//                .delete("/v1/api/opportunity/rooms/67d14ff5017e99234d2874ce")
//                .then()
//                .statusCode(200)
//                .body("result.status",equalTo("true"));
//
//  }
//}
