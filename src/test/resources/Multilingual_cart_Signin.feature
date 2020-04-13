Feature: SignIn to Multilingual Cart online shop
  I want to use this template for SignIn feature
 
Background: SignIn to Multilingual online Machaism
       Given I want to open a chrome Browser
       And I want navigate URL Multiligual cart
       
 Scenario: Successfull Sign In 
    When I want to Sign In with valid credintial
    Then I Expected JAMES WILLIAMS in the profile Name
 
 Scenario: Sign in with invalid id 
      When I want to Sign In with Invalid ID
     Then I Expected to see Enter id 
     
 Scenario: Sign in with invalid password 
    When I want to Sign In with Invalid password
    Then I Expected to see Enter password 
 
  
    
    
    