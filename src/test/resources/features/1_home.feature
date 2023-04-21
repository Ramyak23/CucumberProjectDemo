@tag1
Feature: Homepage feature

    Scenario: User is on Home page and click on Get Started button of one module without sign in
    Given The user on home page
    When The user clicks on Get Started button of Data Structures without login
    Then The user get warning message "You are not logged in"
    
    Scenario: User is on home page and clicking on Data Structures dropdown menu
    Given User clicks Data Structures dropdown menu
    Then User should be able to see list of all the options in the dropdown
    
    Scenario: User click Data Structures dropdown menu and select Arrays
    Given The user click Data Structures dropdown menu and select Arrays options
    Then The user get warning message "You are not logged in"
    
    Scenario: User clicks on Register link in home page
    Given User clicks on Register link
    Then User should land in the Register page
    
    Scenario: User clicks on Sign in link in home page
    Given User clicks on Sign in link
    Then User should land in the Login page
    
    
    
    
    
    
    
    