Feature: Testing Pickaboo
  @MobileTest
    Scenario: Check Home button
        Given Check home button is available
        When  Click on the home button
        Then  Check that home is display
  @MobileTest
    Scenario: Check Categories
        Given Check categories button is available
        When  Click on the Categories button
        Then  Check the Categories is Display
  @MobileTest
    Scenario: Check Support
        Given Check Support button is available
        When  Click on the Support button
        Then  Check the Support us Display
  @MobileTest
    Scenario: Check Slider
        Given Check Slider button is available
        When  Click on the Slider Button
        Then  Check the Slider is Display
  @MobileTest
    Scenario: Check Cart Option
        Given Check Cart button is available
        When  Click the Cart button
        Then  Check the cart button