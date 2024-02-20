@AllFlow
Feature: Search
  User want search kos at website Koskita


  @Search
      #Search
Scenario: User successfully search
Given User already on homepage
When User click to login page
Then User already on login page
When User input "julirenter@gmail.com" as email and "julirenter" as password
Then User already on homepage
When User input search "jakarta selatan" and search

@Search
      #Search a kos that was not found in that address
Scenario: User search a kos that was not found in that address
Given User already on homepage
When User click to login page
Then User already on login page
When User input "julirenter@gmail.com" as email and "julirenter" as password
Then User already on homepage
When User input search "rawamangun" and search