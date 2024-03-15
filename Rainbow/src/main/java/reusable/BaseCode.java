package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseCode {

    public static WebDriver driver;
    public static void launchBrowser() throws IOException {

//        FileInputStream fis= new FileInputStream(new File("src/main/resources/configuration/config.properties"));
//        Properties prop = new Properties();
//        prop.load(fis);
         FileInputStream capturingFiletoStream= new FileInputStream(pathReturn());
         Properties prop = new Properties();
         prop.load(capturingFiletoStream);

        if(prop.getProperty("browser").equalsIgnoreCase("edge"))
            driver=new EdgeDriver();
        else if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
            driver = new ChromeDriver();
        else if (prop.getProperty("browser").equalsIgnoreCase("safari"))
            driver = new SafariDriver();
        else
            throw new InvalidArgumentException("Please enter valid browser");

        driver.get(prop.getProperty("environment"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public static File pathReturn() throws FileNotFoundException {
        File retruningFile= new File("src/main/resources/configuration/config.properties");
        return retruningFile;
    }

}
