package jenkins;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class JenkinsTests {

    @Test
    public void apiTest(){

//        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
//
//        //set the base url and path params
//        spec.pathParams("first","booking","second",3);
//
//        // send the get request and get the response
//        Response response = given().spec(spec).when().get("/{first}/{second}"); //get de body ye ihtiyac yok, dogrudan action a yani when e gec
//        response.prettyPrint();
//
//        // validation
//        Map<String, Object> actualData = response.as(HashMap.class);
//
//        //response un data type i map e uygun olmali o yuzden hashmap yazdik, .class da bu class demek icin
//        // hashmap is a implemnting class from has interface
//        //7:34
//        //from map interface
//
//        System.out.println(actualData);
//
//        Map<String, Object> bookingdates = (Map)actualData.get("bookingdates");
//
//        // object parent of all classes o yuzden casting yapmaliyiz yukarida
//
//        System.out.println(bookingdates);
//
//
//        //validate with map
//        assertEquals("Susan",actualData.get("firstname"));
//        assertEquals("Jones",actualData.get("lastname"));
//        assertEquals(949,actualData.get("totalprice"));
//        assertEquals(true,actualData.get("depositpaid"));
//        assertEquals("2016-07-29",bookingdates.get("checkin"));
//        assertEquals("2020-05-30",bookingdates.get("checkout"));
//
//        //hamcrest matcher ile validate
//        response.then().body("firstname",equalTo("Susan"));
//
//


        System.out.println("hello*****************************");
    }
}
