package com.thetestingacademy.RestAssuredBasics.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class f {
    //https://restful-booker.herokuapp.com/booking
//    curl -X POST \
//    https://restful-booker.herokuapp.com/booking \
//            -H 'Content-Type: application/json' \
//            -d '{
//            "firstname" : "Jim",
//            "lastname" : "Brown",
//            "totalprice" : 111,
//            "depositpaid" : true,
//            "bookingdates" : {
//        "checkin" : "2018-01-01",
//                "checkout" : "2019-01-01"
//    },
//            "additionalneeds" : "Breakfast"
//  }
//    {

    /// /        "username" : "admin",
    /// /            "password" : "password123"
    /// /    }
    @Description("Verify the post request : BDD style")
    @Test
    public void test_POST_BDDStyle() {
        String payload = "{\n" +
                "//        \"username\" : \"admin\",\n" +
                "//            \"password\" : \"password123\"\n" +
                "//    }";
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)
                .when()
                .log().all().post()
                .then()
                .log().all().statusCode(200);
    }

}
//APITesting008_POST
