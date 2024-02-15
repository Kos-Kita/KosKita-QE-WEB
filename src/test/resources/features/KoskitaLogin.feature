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
    When User input "keiowner12@gmail.com" as email and "tatang12" as password
    Then User already on homepage

  @Booking
  Scenario:
    Given User already on homepage
    Then User already on login page
    When User input "keiowner12@gmail.com" as email and "tatang12" as password
    Then User already on homepage