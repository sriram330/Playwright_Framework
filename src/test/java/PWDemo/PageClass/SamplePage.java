package PWDemo.PageClass;

import com.microsoft.playwright.Page;

import java.nio.file.Paths;

public class SamplePage {


    private Page page;

    public SamplePage(Page page){
        this.page = page;
    }


    public  void launchURL(){
        page.navigate("https://opensource-demo.orangehrmlive.com/");

    }


//    public  void clickLogin(){
//        page.click("input:has-text(\"LOGIN\")");
//    }


    public  void EnterCredentials(){
        // Fill input[name="txtUsername"]
        page.fill("input[name=\"txtUsername\"]", "Admin");

        // Press Tab
        page.press("input[name=\"txtUsername\"]", "Tab");
        // Fill input[name="txtPassword"]
        page.fill("input[name=\"txtPassword\"]", "admin123");
        page.click("input:has-text(\"LOGIN\")");

    }


    public  void verifyLoggedIn(){
        page.click("text=Welcome Paul");
    }

    public void screenShot(){

        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshots1/" +  ".png"))) ;
    }
}
