package request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.testConfig;


//metode untuk mendapatkan informasi pengguna berdasarkan ID
public class userRequest {
//    private static final String BASE_URL = "https://reqres.in/api";

    public static Response getUser(int userId){
        return RestAssured.given()
                .baseUri(testConfig.getBaseUrl())
                .basePath("/users/" + userId)
                .get();
    }
    //metode untuk membuat pengguna baru
    public static Response createUser(String name, String job){
        return RestAssured.given()
                .baseUri(testConfig.getBaseUrl())
                .basePath("/users/")
                .header("Content-Type","application/json")
                .body("{ \"name\": \"" + name + "\", \"job\": \"" + job + "\" }")
                .post();
    }
    public static Response updateUser(int userId, String name, String job){
        return RestAssured.given()
                .baseUri(testConfig.getBaseUrl())
                .basePath("/users/"+ userId)
                .header("Content-Type","application/json")
                .body("{ \"name\": \"" + name + "\", \"job\": \"" + job + "\" }")
                .put();
    }
    //metode untuk menghapus user berdasarkan Id
    public static Response deleteUser(int userId){
        return RestAssured.given()
                .baseUri(testConfig.getBaseUrl())
                .basePath("/users/"+userId)
                .delete();
    }
    public static Response loginUser(String email, String password){
        return RestAssured.given()
                .baseUri(testConfig.getBaseUrl())
                .basePath("/login")
                .header("Content-Type","application/json")
                .body("{ \"email\": \"" + email + "\", \"password\": \"" + password + "\" }")
                .post();
    }

    public static Response registerEmail(String email, String password){
        return RestAssured.given()
                .baseUri(testConfig.getBaseUrl())
                .basePath("/register")
                .header("Content-Type","application/json")
                .body("{ \"email\": \"" + email + "\", \"password\": \"" + password + "\" }")
                .post();
    }
}
