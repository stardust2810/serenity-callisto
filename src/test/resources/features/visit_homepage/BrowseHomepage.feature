Feature: Information that HPB wants to expose to public is displayed on the home page
  Users need to be able to view the main navigation, useful info sections, testimonials, Programs on the home page

  @ignored
  Scenario: User visits the HPB Corporate Website Home Page
    Given user visits the Corporate Website
    When user sees 'home-banner,home-first-section,home-second-section,home-last-section,footer' sections

  @ignored
  Scenario: Click on any item in the main navigation
    * user sees the About section in the website
