//package com.rest;
//
//import io.restassured.config.LogConfig;
//import org.testng.annotations.Test;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.logging.Handler;
//
//import static io.restassured.RestAssured.config;
//import static io.restassured.RestAssured.given;
////request and response logging
//public class request {
//    @org.testng.annotations.Test
//    public void validate_logging() {
//        //Given Method
//        given().
//                baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//                //When method
//                        //Logging the request
//                                //log().headers()
//                                        //log().cookies()
//
//                 log().all().
//                        when().get("/v1/api/bootstrap").
//                //Then Method
//
//                        then().
//                //Logging the response
//                 log().all().
//                //
//                assertThat()
//                .statusCode(200);
//
//
//    }
//
//    @org.testng.annotations.Test
//    public void validate_only_error() {
//        //Given Method
//        given().
//                baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//                when().get("/v1/api/bootstrap").
//                        then().
//                //Log if error
//                        log().ifError().
//                        assertThat()
//                .statusCode(200);
//
//
//    }
//
//    @org.testng.annotations.Test
//    public void validate_only_if_validation_fails() {
//        //Given Method
//        given().
//                baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//               log().ifValidationFails().
//                when().get("/v1/api/bootstrap").
//                then().
//                //Log if error
//                        log().ifValidationFails().
//                assertThat()
//                .statusCode(200);
//
//    }
//    @org.testng.annotations.Test
//    public void block_list_header() {
//        Set<String> headers1 = new HashSet<>();
//
//        headers1.add("sid");
//        headers1.add("Accept");
//        LogConfig logConfig = LogConfig.logConfig().blacklistHeaders(headers1);
//
//        //Given Method
//        given().
//                baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid", "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//                 config(config().logConfig(logConfig)).
//                log().all().
//                when().get("/v1/api/bootstrap").
//                then().
//                //Log if error
//                        log().all().
//                assertThat()
//                .statusCode(200);
//
//    }
//    }
