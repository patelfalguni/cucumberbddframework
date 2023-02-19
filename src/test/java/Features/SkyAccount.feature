Feature: SkyAccount

  Scenario: Successful Navigate to Sky Signup page
    Given User launch chrome browser
    When User opens URL "https://skyid.sky.com/signin"
    And User click on the Signup button
    Then Signup page should be display properly
    And close browser
