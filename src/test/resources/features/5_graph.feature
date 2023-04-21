@tag5
Feature: Graph Feature

  Scenario: User validate Graph page
    Given User clicks on Get Started button of Graph in home page
    When User click Graph link in Graph home page
    Then Clicks Try Here button in Graph page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Graph" |
    And Clicks Run button and gets the respected output
    
   
   Scenario: User validate Graph page with wrong python code
    Given Clicks Try Here button in Graph page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Graph |
    And Clicks Run button and gets popup error message 
    
      
  Scenario: User validate Graph Representation page
    Given User click Graph Representation link 
    Then Clicks Try Here button in Graph Representation page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Graph Representation" |
    And Clicks Run button and gets the respected output
       
   
   Scenario: User validate Graph Representation page with wrong python code
    Given Clicks Try Here button in Graph Representation page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Graph |
    And Clicks Run button and gets popup error message  
   