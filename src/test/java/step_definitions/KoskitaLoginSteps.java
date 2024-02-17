package step_definitions;

import org.example.pageObject.KoskitaLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static step_definitions.Hooks.driver;

public class KoskitaLoginSteps {

    private final WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    KoskitaLoginPage koskitaLoginPage = new KoskitaLoginPage(driver);

    @Given("User already on homepage")
    public void verifyUserName(){
        Assert.assertTrue(koskitaLoginPage.verifyAtHomepage());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @Then("User click button sign in")
    public void clickButtonSignin() {
        koskitaLoginPage.clickButtonLogin();
    }

    @When("User input {string} as email and {string} as password")
    public void inpuFieldEmail(String email, String password)  {
        koskitaLoginPage.inputFieldEmail(email);
        koskitaLoginPage.inputFieldPassword(password);
        koskitaLoginPage.clickButtonLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @When("User click to login page")
    public void userClickToLoginPage() {
        koskitaLoginPage.clickGotoLoginPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @And("User click to sign up page")
    public void userClickToSignUpPage() {
        koskitaLoginPage.clickSignUp();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @And("And user want to create account as a renter")
    public void andUserWantToCreateAccountAsARenter() {
        koskitaLoginPage.clickRenter();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @And("And user want to create account as a owner")
    public void andUserWantToCreateAccountAsAOwner() {
        koskitaLoginPage.clickOwner();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @And("User input {string} as name {string} as username {string} as email {string} as a password fill gender and create account")
    public void userInputAsNameAsUsernameAsEmailAsAPasswordFillGenderAndCreateAccount(String name, String username, String email, String password) throws InterruptedException{
        Assert.assertTrue(koskitaLoginPage.verifyAtSignUpPage());
        koskitaLoginPage.inputFieldNameRegister(name);
        koskitaLoginPage.inputFieldUsernameRegister(username);
        koskitaLoginPage.inputFieldEmailRegister(email);
        koskitaLoginPage.inputFieldPasswordRegister(password);
        koskitaLoginPage.clickGender();
        koskitaLoginPage.clickAgree();
        koskitaLoginPage.setBackToLogin();
//        koskitaLoginPage.clickBuatAkun();
//        Thread.sleep(5000);

    }

    @Then("User already on login page")
    public void userAlreadyOnLoginPage() {
        Assert.assertTrue(koskitaLoginPage.verifyAtLoginpage());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }


    @When("User input search {string} and search")
    public void userInputSearchAndSearch(String search) {
        koskitaLoginPage.inputSearch(search);
        koskitaLoginPage.clickSearch();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @When("User click the fourth kos")
    public void userClickTheFourthKos() {
        Assert.assertTrue(koskitaLoginPage.verifyPageSearch());
        koskitaLoginPage.clickFourthKos();
        koskitaLoginPage.verifyOnKosDetail();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @When("User set the date for booking")
    public void userSetTheDateForBooking() {
        koskitaLoginPage.setClickDate();
        koskitaLoginPage.setPickDate();
        koskitaLoginPage.setCloseDate();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }


    @And("User click continue ordering")
    public void userClickContinueOrdering() {
        koskitaLoginPage.setClickOrder();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("User verified the ordering")
    public void userVerifiedTheOrdering() {
        Assert.assertTrue(koskitaLoginPage.setVerifyOrderPage());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @And("User select the payment and pay")
    public void userSelectThePaymentAndPay() throws InterruptedException {
        koskitaLoginPage.setClickPaymentBCA();
//        koskitaLoginPage.setButtonConfirm();
//        koskitaLoginPage.setButtonConfirm();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        koskitaLoginPage.setButtonConfirm();
//        koskitaLoginPage.setButtonConfirm();
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bg-white w-[25rem] p-8 rounded shadow-lg']")));
//            // If the verification element is found, proceed with the next steps
//            // For example:
//            // koskitaLoginPage.clickContinueButton();
//        } catch (NoSuchElementException | TimeoutException e) {
//            // Handle the case where the verification element is not found within the specified time
//            // You can log an error message or take appropriate action
//            System.out.println("Verification element not found within the specified time.");
//        }

        boolean elementFound = false;
        while (!elementFound) {
            koskitaLoginPage.setButtonConfirm();
            TimeUnit.SECONDS.sleep(1); // Optional, you can remove this line if you don't need the delay
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bg-white w-[25rem] p-8 rounded shadow-lg']")));
                elementFound = true; // Set elementFound to true if the element is found
            } catch (NoSuchElementException | TimeoutException e) {
                // Handle the case where the verification element is not found within the specified time
                // You can log an error message or take appropriate action
                System.out.println("Verification element not found within the specified time. Retrying...");
            }
        }
    }

    @Then("User verify the detail payment")
    public void userVerifyTheDetailPayment() {
        Assert.assertTrue(koskitaLoginPage.setVerifyPayment());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
}
