Feature: HeroKuapp


  Scenario: Successful Navigate to HeroKuapp home page
    Given User navigates to the application
    When User opens URL "https://the-internet.herokuapp.com/"
    Then Home page should be display
    