package pl.testframework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

public class SeleniumSteps {

    WebDriver driver;

    @Given("^I am on the home page of softpost \"([^\"]*)\"$")
    public void iAmOnTheHomePageOfSoftpostWebsite(String website) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppiechnik\\Documents\\KursJava-master\\selenium-cucumber_github\\src\\test\\resources\\files\\software\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(website);
        driver.manage().window().maximize();
    }

    //I am on the home page of softpost <website>
   /* @Given("I am on the home page of <website>")
    public void i_am_on_the_website(String website) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppiechnik\\Documents\\KursJava-master\\selenium-cucumber_github\\src\\test\\resources\\files\\software\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(website);
        driver.manage().window().maximize();
        //throw new io.cucumber.java.PendingException();
    }*/

    @Given("I am on the home page of softpost")
    public void i_am_on_the_home_page_of_softpost() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppiechnik\\Documents\\KursJava-master\\selenium-cucumber_github\\src\\test\\resources\\files\\software\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("^I verify that title contains \"([^\"]*)\"$")
    public void i_should_see_that_title_contains(String word) {
        assert driver.getTitle().toLowerCase().contains(word);
        driver.close();
        driver.quit();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should see that title contains tutorials")
    public void i_should_see_that_title_contains_tutorials() {
        assert driver.getTitle().toLowerCase().contains("tutorials");
        driver.close();
        driver.quit();
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should see that title contains {string} phrase")
    public void iShouldSeeThatSitleContainsPhrase(String arg0) {
        assert driver.getPageSource().toLowerCase().contains(arg0);
        driver.close();
        driver.quit();
    }

    @Then("I should see that source contains {string} phrase")
    public void iShouldSeeThatSourceContainsPhrase(String arg0) {
        assert driver.getPageSource().toLowerCase().contains(arg0);
        driver.close();
        driver.quit();
    }

    @Given("I verify the website titles as mentioned below")
    public void iVerifyTheWebsiteTitlesAsMentionedBelow(Map<String, String> dataMap) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppiechnik\\Documents\\KursJava-master\\selenium-cucumber_github\\src\\test\\resources\\files\\software\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String website = dataMap.get("website");
        String title = dataMap.get("title");
        driver.get(website);
        assert driver.getTitle().toLowerCase().contains(title);
        driver.close();
        driver.quit();
    }
}
