@cms
Feature: Manages Content in the Sitefinity CMS
  Users should be able to login to the Sitefinity CMS and manage the content for the HPB Corporate Website (Callisto)

  @page
  Scenario: Joe creates a new page
    * 'Joe' creates a new page

  @login-fail
  Scenario: Jeffrey tries to log in to the CMS with wrong password
    * 'Jeffrey' tries to log in to the CMS with wrong password

  @reset-fail
  Scenario: Unauthorised user tries to reset password
    * 'Unauthorised' tries to reset password
