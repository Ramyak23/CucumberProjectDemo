@tag7
Feature: Queue feature

    Scenario: User validates Implementation of Queue in Python page
    Given User click Implementation of Queue in Python link in Queue home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    
    
    Scenario: User validates Implementation of Queue in Python page with wrong python code
    Given Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the incorrect Python code 
               |pythoncode  | Hello Queue |
    And Clicks Run button and gets popup error message 
    
 
    Scenario: User validates Implementation using collections.deque page
    Given User click Implementation using collections.deque link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    
    
    Scenario: User validates Implementation using collections.deque page with wrong python code
    Given Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the incorrect Python code  
               |pythoncode  | Hello Queue |
    And Clicks Run button and gets popup error message 
    
  
    Scenario: User validates Implementation using array page
    Given User click Implementation using array link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    
    
    Scenario: User validates Implementation using array page with wrong python code
    Given Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the incorrect Python code 
               |pythoncode  | Hello Queue |
    And Clicks Run button and gets popup error message 
    
 
    Scenario: User validates Queue Operations page
    Given User click Queue Operations link
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Welcome to Queue" |
    And Clicks Run button and gets the respected output
    
    
    Scenario: User validates Queue Operations page with wrong python code
    Given Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the incorrect Python code 
               |pythoncode  | Hello Queue |
    And Clicks Run button and gets popup error message 
    Then User navigated to Linked List module
    