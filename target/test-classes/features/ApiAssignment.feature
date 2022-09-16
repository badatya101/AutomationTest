Feature: Verify Category

  @tag1
  Scenario: Verify category responce from coinamp api
    Given The user pass bas uri.
    When The user hit get coinmap api.
    Then The user verify category responce from coinmap api.
    