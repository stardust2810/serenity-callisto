@browse
Feature: Visit the HPB Corporate Website
  Users should see "Home", "About", "Schools", "Community", "Healthy Living", "Partnerships" in the main menu bar and search the website

  @search
  Scenario: Kallista searches for information on the website
    * 'Kallista' searches for 'Healthier Choice' using the website search

  @main-nav
  Scenario: Kallista sees the navigation menu
    * 'Kallista' sees the navigation menu

  @useful-info
  Scenario: Kallista sees the useful info tabs
    * 'Kallista' sees the useful info tabs

  @now
  Scenario: Kallista reads articles found in the News Online for Workplaces section
    * 'Kallista' wants to read N.O.W Issues

  @faq
  Scenario Outline: Kallista wants to search the faqs within the corporate website and the gov ifaq website
    Given 'Kallista' searches for <keyword> within the faq section
    Then 'Kallista' should see the faq programme <name> displayed

  Examples: faq_terms
    | keyword | name |
    | ingredient | Healthier Ingredient Development Scheme |
    | service provider | Directory of Service Providers |

  @feedback
  Scenario: Rei En submits a feedback
    * 'Rei En' submits a feedback

  @about
  Scenario: Kallista visits the about page
    * 'Kallista' visits the about page

  @workplace
  Scenario: Kallista visits the workplace page
    * 'Kallista' visits the workplace page

  @schools
  Scenario: Kallista visits the schools page
    * 'Kallista' visits the schools page

  @community
  Scenario: Kallista visits the community page
    * 'Kallista' visits the community page

  @healthy-living
  Scenario: Kallista visits the healthy living page
    * 'Kallista' visits the healthy living page

  @partnership
  Scenario: Kallista visits the partnership page
    * 'Kallista' visits the partnership page

  @news
  Scenario: Kallista visits the news page
    * 'Kallista' visits the news page

  @rate
  Scenario: Kallista submits the satisfaction poll
    * 'Kallista' submits the satisfaction poll
