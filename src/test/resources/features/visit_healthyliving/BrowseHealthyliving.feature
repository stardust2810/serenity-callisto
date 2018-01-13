Feature: Information pertaining to Healthy Living displayed on the healthy living page
  Users should be able to see the intro text and 3 featured articles

  Scenario: User visits the Healthy Living Page
    Given user visits the Healthy Living Page
    When the page loads
    Then they should see the intro text 'At Health Promotion Board, we promote a holistic approach to leading a healthy lifestyle. This includes staying physically active while maintaining a balanced diet, and going for regular screening. Take a look around this section for a better understanding of the various types of work that we do!'
