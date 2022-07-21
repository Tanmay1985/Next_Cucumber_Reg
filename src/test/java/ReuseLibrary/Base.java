package ReuseLibrary;

import Obj_Repo.Reg_User_Details;
import Obj_Repo.Registration_P_Obj_Repo;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Registration_P_Obj_Repo registration_p_obj_repo;
    public static Reg_User_Details reg_user_details;


    @Before

    public static void driverinitialization() throws IOException {

        Properties prop = new Properties();
        InputStream input = new FileInputStream("D:\\IdeaProjects\\Next_Cucumber_Reg\\src\\test\\java\\Resources\\config.properties");
        prop.load(input);






        String browser = prop.getProperty("Browser");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get(prop.getProperty("URL"));


        driver.manage().window().maximize();


        registration_p_obj_repo = new Registration_P_Obj_Repo(driver);
        reg_user_details = new Reg_User_Details(driver);

//        switch (browser){
//            case "Chrome":
//
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//                break;
//
//            case "Edge":
//                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver();
//                break;
//
//            case "Firefox" :
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//                break;
//        }
//        driver.get(prop.getProperty("URL"));
//        driver.manage().window().maximize();


    }
    @After
    public void CloseApplication() {
        //driver.quit();

    }
}
