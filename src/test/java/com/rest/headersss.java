package com.rest;

import io.restassured.http.Header;
import io.restassured.http.Headers;

import static io.restassured.RestAssured.given;




import static io.restassured.RestAssured.*;
        import io.restassured.http.Header;
import io.restassured.http.Headers;

import java.util.HashMap;

public class headersss {
    @org.testng.annotations.Test
    private void Mock_Headers(){
        Header header1 = new Header("dummy", "header-1");
        Header sidHeader = new Header("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw");
        Headers headers = new Headers(header1, sidHeader);
        given().
                baseUri("https://gdemo.gtmdev.xyz" ).
                headers(headers).
                log().all()
                .when().get("/v1/api/bootstrap").

                  then()
        .log().all();
    }
    @org.testng.annotations.Test
    private void Hashmap_Headers(){
        HashMap<String, String> headers= new HashMap<String,String>();

        headers.put("dummy", "header-1");
        headers.put("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw");

        given().
                baseUri("https://gdemo.gtmdev.xyz" ).
                headers(headers).
                log().all()
                .when().get("/v1/api/bootstrap").

                then()
                .log().all();
    }
    @org.testng.annotations.Test
    private void Request_headers(){
        HashMap<String, String> headers= new HashMap<String,String>();

        headers.put("dummy", "header-1");
        headers.put("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw");

        given().
                baseUri("https://gdemo.gtmdev.xyz" ).
                headers(headers).
                log().all()
                .when().get("/v1/api/bootstrap").

                then().assertThat().
                headers("Request method"  ,"GET");
    }
}
