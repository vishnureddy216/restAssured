
package com.rest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class requestSpecificationResponse {
    RequestSpecification requestSpecification;
    @BeforeClass
    public void beforeClass() {
//         requestSpecification = given()
//                .baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..jNXU-j3jZC-OQiF0M6fN0A.wtyeq1urkLLqh2psCbAylWNQJzf6zbi-sfgg3EyJU-e5Je3RZLzp4cw5CwA0pHFhnvEY-D8TajZOkAQlUm9ORLJ3ghrHJ0yOgChl_KMtmMmlXwion_FSlmrwLVMGrx7WCf3nCpNdlNMp0DjwIyROtPvzgEQAc4V8T6ayaHtGJvifYfhhhdk1vP6517OV8_BWhBs0pJ0hL06FvX6APEkJOOOamljyA0wlbEPYfOytCWCG1ChK3J4UCU4kU27nJZEJj4nGxCPQ68bbcYGNrwUrPLi4S2y3IJoqCLx54rL5OF04MCN5UabVC6ARmg45IFBkSeKQbgOiuZIE6xaw-U0HRg.nzo7QIMSNNpdL2nKSVFieQ");
        RequestSpecBuilder requestSpecBuilder= new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://gdemo.gtmdev.xyz");
        requestSpecBuilder.addHeader("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..jNXU-j3jZC-OQiF0M6fN0A.wtyeq1urkLLqh2psCbAylWNQJzf6zbi-sfgg3EyJU-e5Je3RZLzp4cw5CwA0pHFhnvEY-D8TajZOkAQlUm9ORLJ3ghrHJ0yOgChl_KMtmMmlXwion_FSlmrwLVMGrx7WCf3nCpNdlNMp0DjwIyROtPvzgEQAc4V8T6ayaHtGJvifYfhhhdk1vP6517OV8_BWhBs0pJ0hL06FvX6APEkJOOOamljyA0wlbEPYfOytCWCG1ChK3J4UCU4kU27nJZEJj4nGxCPQ68bbcYGNrwUrPLi4S2y3IJoqCLx54rL5OF04MCN5UabVC6ARmg45IFBkSeKQbgOiuZIE6xaw-U0HRg.nzo7QIMSNNpdL2nKSVFieQ");

        requestSpecification= requestSpecBuilder.build();

    }

    @Test
    public void validate_test_call() {

        given(requestSpecification).when().get("/v1/api/bootstrap").
        then()
                .log().all()
                .assertThat()
                .statusCode(200);

    }
    @Test
    public void validate_test_call2() {

        given(requestSpecification).when().get("/v1/api/bootstrap").
                then()
                .log().all()
                .assertThat()
                .statusCode(200);

    }

}
