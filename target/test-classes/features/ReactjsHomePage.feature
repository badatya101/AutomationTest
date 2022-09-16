Feature: Reactjs home page verification
 
  @tag1
  Scenario: Assignment_1_Get_All_Sub_Text_Link_From_MAIN_CONCEPTS
    Given The user launch Chrome browser.
    When The user click on doc tab from home.
    Then The user click on "Main Concepts" side header text link.
    And The user get all the sub text link from "Main Concepts" side header.
    Then The user close the browser.

 @tag2
  Scenario: Assignment_1_Get_All_Sub_Text_Link_From_Advanced_Guides
    Given The user launch Chrome browser.
    When The user click on doc tab from home.
    Then The user click on "Advanced Guides" side header text link.
    And The user get all the sub text link from "Advanced Guides" side header.
    Then The user close the browser.
    
    @tag3
  Scenario: Assignment_2_Verify_Scrollup_Respected_Content_is_Bolded_On_Right_Navigation 
    Given The user launch Chrome browser.
    When The user click on tutorial tab from home.
    Then The user scroll down and verify the respected content is Bolded on Right Navigation.
    Then The user close the browser.
    
   
    
    
    
   
    