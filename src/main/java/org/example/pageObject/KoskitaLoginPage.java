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

    //SEARCH
    @FindBy (xpath = "//input[@id='search']")
    private WebElement fieldSearch;
    @FindBy(xpath = "//button[text()='Search']")
    private WebElement buttonSearch;
    @FindBy(xpath = "//button[@type='submit' and contains(text(), 'Search')]")
    private WebElement verifySearchPage;
    @FindBy(xpath = "(//h2[@class='cursor-pointer font-bold text-xl hover:text-2xl'])[4]")
    private WebElement fourthKos;

    //DETAIL KOS
    @FindBy(xpath = "//div[@class='bg-[#F2F0F2] rounded-3xl flex flex-col items-center max-w-xl  gap-y-4 p-6']")
    private WebElement verifyKosDetail;
    @FindBy(xpath = "//span[.='Pick a date']")
    private WebElement clickDate;
    @FindBy(xpath = "//button[text()='20']")
    private WebElement getClickDate;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    private WebElement closeDate;
    @FindBy(xpath = "//button[text()='Lanjutkan pemesanan']")
    private WebElement buttonOrder;

    //ORDERING
    @FindBy(xpath = "//div[contains(@class, 'flex flex-col pb-4 font-bold leading-[133%] text-neutral-900 max-md:mt-10 max-md:max-w-full')]")
    private WebElement verifyOrderPage;

    @FindBy(xpath = "//select[@class='grow focus:outline-none w-[45vw] md:w-[22vw] p-4 bg-white rounded border border-solid shadow-sm border-zinc-400 max-md:pr-5']/option[text()='Virtual Account Bca']")
    private WebElement clickPaymentBCA;

    @FindBy(xpath = "//button[contains(text(), 'Confirm and pay')]")
    private WebElement buttonConfirm;

    @FindBy(xpath = "//div[@class='bg-white w-[25rem] p-8 rounded shadow-lg']")
    private WebElement containerPayment;







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
        return verifySignUpPage.isDisplayed();
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


    //SEARCH
    public void inputSearch(String search){
        fieldSearch.sendKeys(search);
    }
    public void clickSearch(){
        buttonSearch.click();
    }
    public boolean verifyPageSearch(){
        return verifySearchPage.isDisplayed();
    }

    //BOOKING
    public void clickFourthKos(){
        fourthKos.click();
    }
    public boolean verifyOnKosDetail(){
        return verifyKosDetail.isDisplayed();
    }
    public void setClickDate(){
        clickDate.click();
    }

    public void setPickDate(){
        getClickDate.click();
    }
    public void setCloseDate(){
        closeDate.click();
    }

    public void setClickOrder(){
        buttonOrder.click();
    }
    public boolean setVerifyOrderPage(){
        return verifyOrderPage.isDisplayed();
    }
    public void setClickPaymentBCA(){
        clickPaymentBCA.click();
    }
    public void setButtonConfirm(){
        buttonConfirm.click();
    }
    public boolean setVerifyPayment(){
        return containerPayment.isDisplayed();
    }

























}
