package utils;
import io.restassured.http.ContentType;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class ApiUtils {
    private static final String BASE_URI = "https://staging.gtmdev.xyz/";
    private static final String SID_TOKEN = "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..WHm_0qHwpQqfmdi9seGisw.WZ3XtGAEtnFHTL4VqLnEsb087TcYAIsxjIbQ-OV0eYdd1hctN93xRRbdedhLUC1_6bCgJT2BJ8wI3KLoxGNxMSNsHo3cuxy7XT12166_ojArCSQIXYsAt7nW-9rkmHL0Sm2gE3FyygQ9VLY0Nwndv_oU4tZjWvfvwXW7EMcnANO6KAraWxLKivtsMtQtKR_0UtvkaKsNuJ-2CX8nPuSjdofAZEhod2EYZ1evG6Vs_jcpcxKMSKKLGfgyP3O9dGmB0NySDIt82m5VO5PRgv5bw8AC59dig1hBNgFL_TwOug6FQF2E2-a0RtZTY5ekbjr6CMy18aLvIbZ0bCvYT5gb2Q.J9ON-x7noeJ-bDGBa-gf8w";

    public static RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .addHeader("sid", SID_TOKEN)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static ResponseSpecification getResponseSpec() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }
}
