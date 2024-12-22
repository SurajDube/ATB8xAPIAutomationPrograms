package com.thetestingacademy.payloadManagement.gson1;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting018payload_POJO {
    @Test
    public void testPostReq() {
        RequestSpecification requestSpecification;
        ValidatableResponse validatableResponse;
        Response response;
/*
String payloadPOST = "{\n" +
                "    \"firstname\" : \"Gmes\",\n" +
                "    \"lastname\" : \"rown\",\n" +
                "    \"totalprice\" : 11231,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2020-03-03\",\n" +
                "        \"checkout\" : \"2019-04-05\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";
*/

        Booking booking = new Booking();
        booking.setFirstname("suraj");
        booking.setLastname("dubey");
        booking.setTotalprice(524);
        booking.setDepositpaid(false);

        Bookingdates bookingDates = new Bookingdates();
        bookingDates.setCheckin("2019-03-03");
        bookingDates.setCheckout("2020-03-03");
        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Lunch");

        System.out.println(booking);

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);

        //requestSpecification.auth().preemptive().basic("admin", "password123");
        requestSpecification.body(booking).log().all();

        response = requestSpecification.when().post();

        Integer bookingId = response.then().extract().path("bookingid");

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        System.out.println("your bookingId is : " + bookingId);

    }
}
