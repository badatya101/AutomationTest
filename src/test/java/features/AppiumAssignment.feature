
Feature: PlyStore page validation

  @tag1
  Scenario: verify Paystore page 
    Given The user launch mobile application.
    When The user click on android home manue.
	  Then The user click on paystor app.
	  And The user click on apps from bottom navigation.
	  And The user click on categories from apps page.
	  Then The user try to verify game from bottom navigation.
	  And The user try to verify Travel and Local from game categories.
	  And The user click on apps from bottom navigation.
	  When The user click on Travel and Local from categories.
	  Then The user click verify airindiGo flight.
    Then The user close the mobile application.
    