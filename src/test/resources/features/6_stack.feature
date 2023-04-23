@tag6
Feature: Stack feature


 
    Scenario: User validate Operations in Stack page
    Given User click Operations in Stack link in Stack home page
    And Clicks Try Here button in Operations in Stack page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Operations in Stack" |
    And Clicks Run button and gets the respected output
    
    
    
    Scenario: User validate Operations in Stack page with wrong python code
    Given Clicks Try Here button in Operations in Stack page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Stack |
    And Clicks Run button and gets popup error message 

    
    
    Scenario: User validate Implementation page
    Given User click Implementation link 
    And Clicks Try Here button in Implementation page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Implementation" |
    And Clicks Run button and gets the respected output
    
    
    
    Scenario: User validate Implementation page with wrong python code
    Given Clicks Try Here button in Implementation page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Stack |
    And Clicks Run button and gets popup error message 
    
    
   
    Scenario: User validate Applications page
    Given User click Applications link 
    And Clicks Try Here button in Applications page
    Then User navigated to tryEditor page and enters the Python code
        |pythoncode  | print"Welcome to Applications" |
    And Clicks Run button and gets the respected output
    
    
    
    Scenario: User validate Applications page with wrong python code
    Given Clicks Try Here button in Applications page
    Then User navigated to tryEditor page and enters the incorrect Python code 
          |pythoncode  | Hello Stack |
    And Clicks Run button and gets popup error message 
    Then User navigated to Queue module