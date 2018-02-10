@cms-uat
Feature: Manages Content in the Sitefinity CMS
  Users should be able to login to the Sitefinity CMS and manage the content for the HPB Corporate Website (Callisto)

  @page
  Scenario: Kallista creates a new page @Skip
    * 'Kallista' creates a new page

  @login-fail
  Scenario: Unauthorised tries to log in to the CMS with wrong password @Skip
    * 'Unauthorised' tries to log in to the CMS with wrong password

  @reset-fail
  Scenario: Unauthorised user tries to reset password @Skip
    * 'Unauthorised' tries to reset password

  @page-cloud
  Scenario: Kallista creates page in Sitefinity Cloud
    * 'Kallista' creates page in sitefinity cloud
