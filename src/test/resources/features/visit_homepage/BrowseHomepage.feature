Feature: Information that HPB wants to expose to public is displayed on the home page
  Users need to be able to view the main navigation, useful info sections, testimonials, Programs on the home page

  Scenario: User visits the HPB Corporate Website
    Given user visits the Corporate Website
    When user sees 'home-banner,home-first-section,home-second-section,home-last-section,footer' sections

  Scenario: Click on any item in the main navigation
    * user sees the About section in the website

  Scenario: user sees the testimonials on the homepage
    * user sees the testimonial section in the website