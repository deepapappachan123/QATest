$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Launch zdnet link and navigate to AWS site and verify title and URI.",
  "description": "",
  "id": ";launch-zdnet-link-and-navigate-to-aws-site-and-verify-title-and-uri.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enter list of cloud platforms in google search",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on zdnet link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify AWS,Azure,GCP are listed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "If AWS present click on Jump to details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on view now at amazone",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "it opens up a new tab within the same browser",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "it opens up this URL \u003curl\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "it lands to the page which shows \u003ctitle\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": ";launch-zdnet-link-and-navigate-to-aws-site-and-verify-title-and-uri.;",
  "rows": [
    {
      "cells": [
        "url",
        "title"
      ],
      "line": 13,
      "id": ";launch-zdnet-link-and-navigate-to-aws-site-and-verify-title-and-uri.;;1"
    },
    {
      "cells": [
        "https://aws.amazon.com/what-is-aws/",
        "Cloud computing with AWS"
      ],
      "line": 14,
      "id": ";launch-zdnet-link-and-navigate-to-aws-site-and-verify-title-and-uri.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Launch zdnet link and navigate to AWS site and verify title and URI.",
  "description": "",
  "id": ";launch-zdnet-link-and-navigate-to-aws-site-and-verify-title-and-uri.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User enter list of cloud platforms in google search",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on zdnet link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify AWS,Azure,GCP are listed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "If AWS present click on Jump to details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on view now at amazone",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "it opens up a new tab within the same browser",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "it opens up this URL https://aws.amazon.com/what-is-aws/",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "it lands to the page which shows Cloud computing with AWS",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.userIsOnGoogle()"
});
formatter.result({
  "duration": 10456150879,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Clicks_zdnet_link()"
});
formatter.result({
  "duration": 12416409382,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifyAws_Azure_Gcp_InList()"
});
formatter.result({
  "duration": 1017481739,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.jumpToAWSDetails()"
});
formatter.result({
  "duration": 2238687046,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.clickViewNowAtAmazone()"
});
formatter.result({
  "duration": 3597482503,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.verifyNewTabSameBrowser()"
});
formatter.result({
  "duration": 7018191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://aws.amazon.com/what-is-aws/",
      "offset": 21
    }
  ],
  "location": "stepDefinition.verifyURL(String)"
});
formatter.result({
  "duration": 2639544259,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cloud computing with AWS",
      "offset": 33
    }
  ],
  "location": "stepDefinition.verifyTitle(String)"
});
formatter.result({
  "duration": 479334713,
  "status": "passed"
});
});