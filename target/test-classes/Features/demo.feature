#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Place order on DemoBlaze site

  Scenario Outline: Place an order to buy a laptop using Credit Card
    Given I want to place an order to buy a laptop in  <site>
    When I look my laptop <laptop> in Laptops section
    And fill the form <Name> <Country> <City> <CreditCard> <Month> <Year>
    Then I verify the <ExpectedResult> of my order

    Examples: 
      | site  | laptop | Name | Country | City | CreditCard | Month | Year | ExpectedResult |
      | "https://demoblaze.com/" | "MacBook Pro" | "John Doe" | "Portugal" | "Lisbon" | "375567668884617" | "02" | "2030" | "Thank you for your purchase!" |
      | "https://demoblaze.com/" | "MacBook Pro" | "Percy Clayton" | "United States" | "Jacksonville" | "4411732769254916" | "4" | "2029" | "Thank you for your purchase!" |