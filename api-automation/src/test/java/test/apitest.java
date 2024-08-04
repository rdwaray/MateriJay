package test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import request.userRequest;
import utilities.testConfig;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class apitest {

    private static final String JSON_Schema = "jsonSchema/listSchema.json";

    @BeforeClass
    public void setup(){
        testConfig.setupRestAssured();
    }
    @AfterClass
    public void close(){
        System.out.println("Semua pengetesan selesai");
    }

    //Test positif
    //test get user berdasarkan Id
    @Test
    public void testGetUserById() {
        int userId = 1;

        Response response = userRequest.getUser(userId);
        System.out.println("Respond : " +response.getBody().asString());
        response.then().statusCode(200);
        Assert.assertEquals(response.jsonPath().getString("data.id"), String.valueOf(userId));
        Assert.assertNotNull(response.jsonPath().getString("data.email"));
        System.out.println("Pencarian Id: " + userId);
        System.out.println("Status Code: " + response.statusCode());

    }
    //Test create user
    @Test
    public void testCreateUser() {
        String name = "Ray";
        String job = "QA";
        Response response = userRequest.createUser(name, job);
        System.out.println("Respond : " +response.getBody().asString());
        response.then().statusCode(201);
        Assert.assertEquals(response.jsonPath().getString("name"), name);
        Assert.assertEquals(response.jsonPath().getString("job"), job);
        System.out.println("User dibuat dengan nama : "+name + " dan pekerjaan : " +job);
        System.out.println("Status Code: " + response.getStatusCode());
    }
    //Test put update user
    @Test
    public void testUpdateUser() {
        int userId = 2;
        String name = "Dimas";
        String job = "Magang";
        Response response = userRequest.updateUser(userId, name, job);
        System.out.println("Respond : " +response.getBody().asString());
        response.then().statusCode(200);
        Assert.assertEquals(response.jsonPath().getString("name"), name);
        Assert.assertEquals(response.jsonPath().getString("job"), job);
        System.out.println("Data user diupdate dengan nama : "+name + " dan pekerjaan :" +job);
        System.out.println("Status Code: " + response.getStatusCode());
    }
    //test delete user
    @Test
    public void testDeleteUser() {
        int userId = 2;
        Response response = userRequest.deleteUser(userId);

        response.then().statusCode(204);
        System.out.println("User id : "+ userId + " telah dihapus");
        System.out.println("Status Code: " + response.getStatusCode());
    }


    //test negatif
    //test get user dengan Id yang salah
    @Test
    public void testGetUserInvalidId() {
        int userId = 7584;

        Response response = userRequest.getUser(userId);
        response.then().statusCode(404);

        System.out.println("Gagal mendapatkan data user Id : "+ userId);
        System.out.println("Status Code: " + response.getStatusCode());
    }
    @Test
    public void tesGagalRegister() {
        String email = "ray@example.com";
        String password = "";

        Response response = userRequest.registerEmail(email, password);
        System.out.println("Respond : " +response.getBody().asString());
        response.then().statusCode(400);

        System.out.println("Email : "+ email + " gagal register");
        System.out.println("Karena password : ("+ password + ") salah format");
        System.out.println("Status Code: " + response.getStatusCode());
    }

    @Test
    public void testGagalLogin() {
        String email = "peter@klaven";
        String password = "ff42";

        Response response = userRequest.loginUser(email, password);
        System.out.println("Respond : " +response.getBody().asString());

        response.then().statusCode(400);

        System.out.println("Email : "+ email + " gagal login");
        System.out.println("Karena password : ("+ password + ") salah");
        System.out.println("Status Code: " + response.getStatusCode());
    }

    //test boundary
    //test boudary user berdasarkan ID

    @Test
    public void testBoundary() {
        //test Id terkecil
        verifyUserById(1);

        //test Id terbesar
        verifyUserById(12);

        //test out of bound
        verifyUserById(200); // Invalid ID
    }

    private void verifyUserById(int userId) {
        Response response = userRequest.getUser(userId);

        System.out.println("Testing Id: " + userId);
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Respond : " +response.getBody().asString());

        if (userId >= 1 && userId <= 12) {
            Assert.assertEquals(response.getStatusCode(), 200, "User dengan Id " + userId + " tidak ditemukan");
        } else {
            Assert.assertEquals(response.getStatusCode(), 404, "User dengan Id " + userId + " tidak ditemukan");
        }
    }
}
