@tag10

Feature: Array feature
             
                
    Scenario: User validates Arrays in Python page
    Given User click Arrays in Python link in Array home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Arrays in Python" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
        
    Scenario: User validates Arrays Using List page
    Given User click Arrays Using List link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Arrays Using List" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
       
    Scenario: User validates Basic Operations in Lists page
    Given User click Basic Operations in Lists link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Basic Operations in Lists" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
    
    Scenario: User validates Applications of Array page
    Given User click Applications of Array link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Applications of Array" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello Array |
    And Again clicks Run button and gets popup error message 
    
        
    Scenario: User validates Practice Questions page
    Given User click Practice Questions link 
    Then User navigated to array practice page with respective four practice link
    
        
    Scenario: User validates Search the array page
    Given User clicks Search the array practice link
    Then User enters the Python code in the respective field
               |pythoncode  | print"Search the array" |
    Then Clicks the Run button and gets the respected output
    Then User validates with the wrong Python code 
               |pythoncode  | Hello Array |
    And Again click the Run button and gets popup error message      
    Then User navigated to home page   