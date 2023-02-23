

import io.javalin.Javalin;
import io.javalin.http.Context;

public class JavalinSingleton {

    
    /**
     * Using the app.get method, Create an HTTP GET endpoint at the url: http://localhost:9000/hello that will
     * return the string "Hello World" in the response.
     *
     * You will not need to run app.start in this method. The test cases, or main method, will do this for you - this
     * method only needs to return a properly configured Javalin Server, represented by the 'app' object created below.
     * 
     * Note: Please refer to the "CreatingEndpoints.MD" file for more assistance if needed.
     */

     public static Javalin getInstance(){
        Javalin app = Javalin.create();
        

        //write endpoint here
        app.get("/hello", ctx -> {
            //logic to be executed when this endpoint is hit
            ctx.result("Hello World");
        });


        return app;
    }
    
}
