package setting;

import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.core.Is.is;

public class Settings {

    private String JOB_ID = "http://api.dataatwork.org/v1/jobs/";
    private Response response;


    public void searchJobById(String uuid){
        response = SerenityRest.when().get(JOB_ID + uuid);
    }

    public void searchIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }

    public void jobTitleFind(String job_name){
        response.then().body("title", is(job_name));
    }
}
