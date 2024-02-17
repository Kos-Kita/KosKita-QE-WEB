@AllFlow
Feature: Login
  User want login to website Koskita as renter and owner

  @Login
  Scenario: User login with valid credential as renter
    Given User already on homepage
    When User click to login page
    And  User click to sign up page
    And And user want to create account as a renter
    And User input "kei renter " as name "keirenter12" as username "keirenter12@gmail.com" as email "tatang12" as a password fill gender and create account
    Then User already on login page
    When User input "keirenter12@gmail.com" as email and "tatang12" as password
    Then User already on homepage


  @Login
  Scenario: User login with valid credential as owner
    Given User already on homepage
    When User click to login page
    And  User click to sign up page
    And And user want to create account as a owner
    And User input "kei owner" as name "keiowner12" as username "keirenter12@gmail.com" as email "tatang12" as a password fill gender and create account
    Then User already on login page
    When User input "juliowner@gmail.com" as email and "juliowner" as password
    Then User already on homepage

  @Booking
  Scenario: User renter booking
    Given User already on homepage
    When User click to login page
    Then User already on login page
    When User input "julirenter@gmail.com" as email and "julirenter" as password
    Then User already on homepage
    When User input search "jakarta" and search
    And User click the fourth kos
    And User set the date for booking
    And User click continue ordering
    Then User verified the ordering
    When User select the payment and pay
    Then User verify the detail payment









