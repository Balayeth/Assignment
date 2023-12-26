Feature: Verify the Login Functionality

#TC_01
  @Nitex
  Scenario: Verify that user is able to login successfully
    Given Home page is displayed
    Then Check that the sign in button is available
    When Click on the sign in button
    Then Check that the Sign in window is displayed
    When Enter the email
    And Enter password
    And Click on Sign in button



