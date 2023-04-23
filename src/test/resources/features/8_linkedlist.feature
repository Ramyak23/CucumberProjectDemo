@tag8

Feature: LinkedList feature
 
                
    Scenario: User validates Introduction-LinkedList page
    Given User click Introduction link in LinkedList home page
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Introduction of LinkedList" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
       
    
    Scenario: User validates Creating Linked LIst page
    Given User click Creating Linked LIst link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Creating Linked LIst" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    
    Scenario: User validates Types of Linked List page
    Given User click Types of Linked List link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Types of Linked List" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message  
    
    
    
    Scenario: User validates Implement Linked List in Python page
    Given User click Implement Linked List in Python link
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Implement Linked List in Python" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    
    Scenario: User validates Traversal page
    Given User click Traversal link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Traversal" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
    
    Scenario: User validates Insertion page
    Given User click Insertion link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Insertion" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    
    
   
    Scenario: User validates Deletion page
    Given User click Deletion link 
    And Clicks Try Here button in that specific link page
    Then User navigated to tryEditor page and enters the Python code
               |pythoncode  | print"Deletion" |
    And Clicks Run button and gets the respected output
    Then User navigated back to tryEditor page and enters the wrong Python code 
               |pythoncode  | Hello LinkedList |
    And Again clicks Run button and gets popup error message 
    Then User navigated to Tree module
    
    