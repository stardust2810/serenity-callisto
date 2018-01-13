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
  Scenario: Joe wants to search the faqs within the corporate website and the gov ifaq website
    * 'Joe' wants to search both the local and gov faqs