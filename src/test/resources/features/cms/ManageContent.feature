@cms-uat
Feature: Manages Content in the Sitefinity CMS
  Users should be able to login to the Sitefinity CMS and manage the content for the HPB Corporate Website (Callisto)

  @page
  @ignored
  Scenario: Kallista creates a new page
    * 'Kallista' creates a new page

  @login-fail
  @ignored
  Scenario: Unauthorised tries to log in to the CMS with wrong password @Skip
    * 'Unauthorised' tries to log in to the CMS with wrong password

  @reset-fail
  @ignored
  Scenario: Unauthorised user tries to reset password @Skip
    * 'Unauthorised' tries to reset password

  @page-cloud
  @ignored
  Scenario: Kallista creates page in Sitefinity Cloud
    * 'Kallista' creates page in sitefinity cloud
