@tag4
Feature: DataStructures Introduction


  Scenario: User validate DataStructures-Introduction and Time Complexity page
    Given User clicks on Get Started button of Data Structures-Introduction tab
    When User click time complexity link in data structures page
    And User clicks Try Here button in time complexity page
    Then User navigated to tryEditor page and enters the Python code as "print('DataStructures')"
    And Clicks Run button and gets the output
  
 
  Scenario: User validate Time Complexity page with wrong python code
    Given User clicks Try Here button in time complexity page
    Then User navigated to tryEditor page and enters the incorrect Python code syntax as "Hello"
    And Clicks Run button and gets the popup error message