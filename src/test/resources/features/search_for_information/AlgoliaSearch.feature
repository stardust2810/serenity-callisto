Feature: Use Algolia search to look for information
  Users need to be able to search for information on the website using Algolia search

  Scenario: Search for HCS related article pages
    Given user is at the home page
    When the user searches for 'Healthier Choice Symbol'
    Then they should see 'Search Results' page
