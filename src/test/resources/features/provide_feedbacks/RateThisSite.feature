Feature: Rate this site form is used to collect feedbacks from the public
  Users is able to view and submit their feedbacks to HPB via the "Rate This Site" form.

  Scenario: User submits feedbacks via the "Rate this site" form
    Given user is on the "Rate This Site" form
    When user clicks on the "Submit" button
    Then user sees the "Thank You" message
