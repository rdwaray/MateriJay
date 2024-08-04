package utilities;

import io.restassured.RestAssured;

public class testConfig {
    private static final String BASE_URL = "https://reqres.in/api";

    public static String getBaseUrl(){
        return BASE_URL;
    }
    public static void setupRestAssured(){
        RestAssured.baseURI = getBaseUrl();
    }
}
