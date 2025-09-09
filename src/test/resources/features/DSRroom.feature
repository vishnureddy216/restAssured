Feature: DSR Management

Scenario : Create New DSR Room
Given I have a valid DSR payload
  When I send a POST request to create a new DSR room
  Then I should receive a successful response
  And the room status should be "DRAFT"




