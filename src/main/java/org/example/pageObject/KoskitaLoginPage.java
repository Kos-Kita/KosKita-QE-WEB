package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoskitaLoginPage {

    public static WebDriver webDriver;

    public KoskitaLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//p[text()='Cari disini aja dah']")
    private WebElement verifyHomepage;

    //LOGIN
    @FindBy (xpath = "//h2[text()='Masuk Akun']")
    private WebElement verifyLoginPage;
    @FindBy (xpath = "//li[text()='Login']")
    private WebElement gotoLogin;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement fieldEmail;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;
    @FindBy (xpath = "//button[text()='Login']")
    private WebElement buttonLogin;

    //REGISTER
    @FindBy(xpath = "//span[contains(@class, 'text-[#4CA02E]') and text()='Sign up']")
    private WebElement buttonSignUp;
    @FindBy(xpath = "//div[@class='flex rounded-md border p-1 bg-slate-50 gap-x-1']/span[text()='Renter']")
    private WebElement buttonRenter;
    @FindBy(xpath = "//div[@class='flex rounded-md border p-1 bg-slate-50 gap-x-1']/span[text()='Owner']")
    private WebElement buttonOwner;
    @FindBy(xpath = "//div[contains(@class, 'self-center') and contains(text(), 'By creating an account you agree to our')]")
    private WebElement verifySignUpPage;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement fieldName;
    @FindBy(xpath = "//input[@name='user_name']")
    private WebElement fieldUsername;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement fieldEmailRegister;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPasswordRegister;
    @FindBy(xpath = "//select[@name='gender']/option[@value='laki-laki']")
    private WebElement dropdownGender;
    @FindBy(xpath = "//input[@id='checkbox-register']")
    private WebElement checklistAgree;
    @FindBy(xpath = "//button[text()='Buat Akun']")
    private WebElement buttonCreateAccount;




    // action

    //LOGIN

    public boolean verifyAtLoginpage(){
        return verifyLoginPage.isDisplayed();
    }
    public boolean verifyAtHomepage(){
        return verifyHomepage.isDisplayed();
    }
    public void clickGotoLoginPage(){
        gotoLogin.click();
    }
    public void inputFieldEmail(String email){
        fieldEmail.sendKeys(email);
    }
    public void inputFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }
    public void clickButtonLogin(){
        buttonLogin.click();
    }

    //REGISTER
    public void clickSignUp(){
        buttonSignUp.click();
    }
    public void clickRenter(){
        buttonRenter.click();
    }
    public void clickOwner(){
        buttonOwner.click();
    }
    public boolean verifyAtSignUpPage(){
        return verifyHomepage.isDisplayed();
    }
    public void inputFieldNameRegister(String name){
        fieldName.sendKeys(name);
    }
    public void inputFieldUsernameRegister(String username){
        fieldUsername.sendKeys(username);
    }
    public void inputFieldEmailRegister(String email){
        fieldEmailRegister.sendKeys(email);
    }
    public void inputFieldPasswordRegister(String password){
        fieldPasswordRegister.sendKeys(password);
    }
    public void clickGender(){
        dropdownGender.click();
    }
    public void clickAgree(){
        checklistAgree.click();
    }
    public void clickBuatAkun(){
        buttonCreateAccount.click();
    }












}
