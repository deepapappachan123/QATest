Feature:

  Scenario Outline:Launch zdnet link and navigate to AWS site and verify title and URI.
    Given User enter list of cloud platforms in google search
    When User clicks on zdnet link
    Then Verify AWS,Azure,GCP are listed
    And If AWS present click on Jump to details
    And click on view now at amazone
    And it opens up a new tab within the same browser
    And it opens up this URL <url>
    And it lands to the page which shows <title>
    Examples:
      | url                                 | title |
      | https://aws.amazon.com/what-is-aws/ | Cloud computing with AWS   |