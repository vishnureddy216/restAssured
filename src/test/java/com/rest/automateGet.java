//package com.rest;
//import io.restassured.response.Response;
//import org.testng.Assert;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.Matchers.hasItems;
//
//public class automateGet {
//
//           @org.testng.annotations.Test
//                public void validate_get_call(){
//               //Given Method
//               given().
//                       baseUri("https://gdemo.gtmdev.xyz")
//                       .header("sid","eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//                      //When method
//                       when().get("/v1/api/bootstrap").
//                       //Then Method
//                       then().
//                       log().all().
//                       assertThat()
//                       .statusCode(200);
//
//
//
//    }
//    @org.testng.annotations.Test
//    public void validate_response_body(){
//        //Given Method
//        given().
//                baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid","eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//                //When method
//                        when().get("/v1/api/bootstrap").
//                //Then Method
//                        then().
//                log().all().
//                assertThat()
//                .statusCode(200)
//                .body("result.personal_folder_id", equalTo("62d8e69997be77244f596f7b"));
//
//
//
//    }
//
//    @org.testng.annotations.Test
//    public void validate_extract_response(){
//        //Given Method
//       Response res= given().
//                baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid","eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//                //When method
//                        when().get("/v1/api/bootstrap").
//                //Then Method
//                        then().
//
//                assertThat()
//                .statusCode(200).extract().response();
//              System.out.println("print the response"+res.asString());
//
//
//
//
//    }
//    @org.testng.annotations.Test
//    public void validate_extract_Single_response(){
//        //Given Method
//        Response res= given().
//                baseUri("https://gdemo.gtmdev.xyz")
//                .header("sid","eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..D-BhI2q3BPpa_SNobOTj8Q.JjvA2N-HblrveVJ14fWv0sjuf1rF2UzgqUjFikg43S6vdN7qFZI6Ndyw4Ca0lt_8CxG2Jgr-OyfujWLDW21kHrVnl41PeUre9pAx3WZ5SNscDVsIZ3HwcozwXWgOGhxLC613i_bU7l_HK8NDig6CtYgZsitvpN1PHmLPafPT6TMY3WKKRsWlT3HGXbLkDDUi6JQWFp9c4fVYTRjdIazbKmUf1Ty7x_VxsbeosM0qBt57OtxtWdPgHMVUVAjqZ1hr_g4fsf8nSzqY2soU-UVp6Ehgogy0Sf64J7dbpJeJxY-0KtCnTxHA7cvm2opXXEoRTJoZvSdNZzzF2Yrzke6XIA.5NRrF798DTBIZDURurqCLw").
//                //When method
//                        when().get("/v1/api/bootstrap").
//                //Then Method
//                        then().
//
//                assertThat()
//                .statusCode(200).extract().response();
//        System.out.println("Extract single response "+res.path("result.personal_folder_id"));
////Assert that is a hamster asserction extrected response
//        assertThat("result.personal_folder_id",equalTo("62d8e69997be77244f596f7b"));
// //TesNg assert   response
//        Assert.assertEquals("result.personal_folder_id","62d8e69997be77244f596f7b");
//
//
//
//
//    }
//}
