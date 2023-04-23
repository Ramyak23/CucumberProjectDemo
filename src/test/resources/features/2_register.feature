@tag2
Feature: Register feature with ExcelSheet Handling


Scenario Outline: Register scenario with different set of data
Given User navigates to Register page 
When  User enters user data from given sheetname "<SheetName>" and rownumber <RowNumber> 
And   User clicks on Register button
Then  User see an approriate message regarding password mismatch

Examples:
|SheetName|RowNumber|
| data    |   0     |
| data    |   1     |
| data    |   2     |
| data    |   3     |
| data    |   4     |
| data    |   5     |



Scenario Outline: Register scenario handling with some empty textbox fields
Given User navigates to Register page 
When  User enters user data "<username>" "<password>" "<confirmpassword>"only in specific textbox by leaving other fields empty
And   User clicks on Register button
Then  It should display an error "Please fill out this field." 

Examples:
|username|password|confirmpassword|
|        |hello   |hello          |
|ramya   |        |helloworld     |


