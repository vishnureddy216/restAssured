package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
/**
 * This class provides utility methods for creating RequestSpecifications and ResponseSpecifications
 * for API requests.
 */
public class ApiUtils {
    // Base URI for API requests
    private static final String BASE_URI = "https://staging.gtmdev.xyz/";

    // Authentication tokens for different roles
    private static final String ADMIN_TOKEN   = "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..WHm_0qHwpQqfmdi9seGisw.WZ3XtGAEtnFHTL4VqLnEsb087TcYAIsxjIbQ-OV0eYdd1hctN93xRRbdedhLUC1_6bCgJT2BJ8wI3KLoxGNxMSNsHo3cuxy7XT12166_ojArCSQIXYsAt7nW-9rkmHL0Sm2gE3FyygQ9VLY0Nwndv_oU4tZjWvfvwXW7EMcnANO6KAraWxLKivtsMtQtKR_0UtvkaKsNuJ-2CX8nPuSjdofAZEhod2EYZ1evG6Vs_jcpcxKMSKKLGfgyP3O9dGmB0NySDIt82m5VO5PRgv5bw8AC59dig1hBNgFL_TwOug6FQF2E2-a0RtZTY5ekbjr6CMy18aLvIbZ0bCvYT5gb2Q.J9ON-x7noeJ-bDGBa-gf8w";
    private static final String PARTNER_MANAGER = "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..-B5ctgAbWyCw9_UbMU1pQQ.H3qEa5CRDX8ei_rHwLws4KayHl4LONiOEUItXva17-LYqJJfeg0ILuOy-qStiU-I6EVL81BYKW_FanUi1RiP3zZ9xvanGwD344TtnaV9gctlxTnfZ8DkHnFcydJpsIQjfrwQqF_Sd94RL13_uNnpag9igWTeekU4-QE4hghZs6b2APy8EH2B3r3RLhc0mH5qFQWIJyh1GYjbPFBbZke0cfro_OvQO65pKvFNLWpQGMrUjqBhYJ1dR-tptXmIocWSolHcppgQsJTcai9AOyPuPd_bEbpqBDRB-0TbAldmLxdMWZbw152_DVq737SDepljwUresxB1fgQ6GCiyd4CzFA.DYR6XM3KESjdyWIvM13HXQ";
    private static final String USER_TOKEN    = "eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..F_94IGycf4laO2UmQ8aVdg._9VVgtSjHnhCUXUy-mAWvPBdpFcZV09gxRQIbv54Nl4cSftQ_aOIuZwf1iJd5rbe4pDgjPACJyyV-mt7ryiDSDkwpcPdDkr-9OsaLeE7ze6AnZcNHl3F-DDBC3Bx4zOoZSX3bVnkC1_oD9nxF0Db_DxiE9y67kLWMJZcXBB0t3VUhMusD8RjxHyJFYNzHyIne1TOWmJLCeAhf802p3xNSlShs6oueV8nS35Vv1Wx8EAwvJ3S1258eObhBD2nZ6l6JBRCWSu6SBJsN3bwI7WlSXXULDd8zlWirjTNKUoCPLW5CPiajj1IrnwLzmULgzhdMJaQilPZwJLO69bQBJlVnQ.iWpfcdyfMnxnEnkE2wFovQ";

    /**
     * Get RequestSpecification for a given role.
     * Roles supported: admin, manager, user
     */
    public static RequestSpecification getRequestSpec(String role) {
        String sidToken;

        switch (role.toLowerCase()) {
            case "admin":
                sidToken = ADMIN_TOKEN;
                break;
            case "partner_manager":
                sidToken = PARTNER_MANAGER;
                break;
            case "user":
                sidToken = USER_TOKEN;
                break;
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }

        return new RequestSpecBuilder()
                .setBaseUri(BASE_URI)
                .addHeader("sid", sidToken)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
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
