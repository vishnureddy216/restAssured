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
//import utils.ApiUtils;
//
//import utils.Jsonutils;
//import java.io.File;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.equalTo;
//
//public class FileUploadTest {
//    ResponseSpecification responseSpecification;
//    RequestSpecification requestSpecification;
//    private File zipFile;
//
//    @BeforeClass
//    public void setUp() {
//        requestSpec = ApiUtils.getRequestSpec();
//        responseSpec = ApiUtils.getResponseSpec();
//    }
//    @Test
//    public void scormUpload(){
//        File zipFile= new File("src/main/resources/Scrom1.zip");
//        given()
//                .spec( requestSpec)
//                .multiPart("file",zipFile, "application/zip")
//                .when()
//                .post("v1/api/lms/lesson/67dc432a65aa3015dbbe0d19/scorm/package")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract()
//                .response();
//
//
//    }
//}
