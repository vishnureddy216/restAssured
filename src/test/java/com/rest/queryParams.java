package com.rest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class queryParams {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    @BeforeClass
    public void beforeClass(){
        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri("https://gdemo.gtmdev.xyz");
        requestSpecBuilder.addHeader("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..kIaFM8ryXXcIuVo9uPJmfg.i9NUortYGF5kdRMPoPrDj0Y8gwedqJUW_9Na1tnTYD-bHzFzWoMi1qm50HOi4rWATFULPRM9_gFPqRvf_fHNEDTV3Zwkg1WeVinHH5LfZRn7p_uUeRG_W7igoPQUq3lNb2svxwWs9XX6uozplXxx7VtydmP3qkQw8R7stwU2zyFa6W5WurfAEYcvlqV0aueC-snSmObHNAElKiF3MGai3W9birWqnefCKxeHAszrGVu1VxV2WqMctvfjYfoLjItOyLMN8vAHg-8VeDFL8T4gtnlNz4sWDFGAazVnWsUdmvOVtbXbRndlQVuVtgkGhKMdKoTcrC31uwqNKBQRj7_Stw.2boi9ekjC_7UtG_6PlAO7Q");
        requestSpecBuilder.setContentType(ContentType.JSON);

        requestSpecification= requestSpecBuilder.build();

        ResponseSpecBuilder responseSpecBuilder= new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL);
        responseSpecification = responseSpecBuilder.build();
    }

    @Test
    public void queryParametrised(){
        given().spec(requestSpecification)
                .queryParam("user_id","65964c5ebb3d5e508435201e")
                .log().all()
                .when()
                .post("/v1/api/analytics-view/LMS_TEAMS_MY_RUBRICS")
               .then()
                .log().all(

                )
                .statusCode(200);
    };
    @Test
    public void MultiplequeryParametrised(){
        //we can pass mutilple quary parms using the hashmap
        HashMap<String,String> queryParams=new HashMap<>();
        queryParams.put("user_id","65964c5ebb3d5e508435201e");

        given().spec(requestSpecification)
                .queryParams(queryParams)
//                .queryParam("user_id","65964c5ebb3d5e508435201e")
                .log().all()
                .when()
                .post("/v1/api/analytics-view/LMS_TEAMS_MY_RUBRICS")
                .then()
                .log().all(

                )
                .statusCode(200);
    };
public void updateusername(){
    given().spec(requestSpecification);
   when().post("/v1/api/opportunity/rooms").
            then();
}


}
