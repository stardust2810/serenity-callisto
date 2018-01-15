@browse
Feature: Visit the HPB Corporate Website
  Users should see "Home", "About", "Schools", "Community", "Healthy Living", "Partnerships" in the main menu bar and search the website

  @search
  Scenario: Joe searches for information on the website
    * 'Joe' searches for 'Healthier Choice' using the website search

  @main-nav
  Scenario: Joe sees the navigation menu
    * 'Joe' sees the navigation menu

  @useful-info
  Scenario: Joe sees the useful info tabs
    * 'Joe' sees the useful info tabs

  @workplace
  Scenario: Joe reads articles found in the News Online for Workplaces section
    * 'Joe' wants to read N.O.W Issues

  @faq
  Scenario Outline: Joe wants to search the faqs within the corporate website and the gov ifaq website
    Given 'Joe' searches for <keyword> within the faq section
    Then 'Joe' should see the faq programme <name> displayed

  Examples: faq_terms
    | keyword | name |
    | ingredient | Healthier Ingredient Development Scheme |
    | service provider | Directory of Service Providers |

  @feedback
  Scenario: Joe submits a feedback
    * 'Joe' submits a feedback