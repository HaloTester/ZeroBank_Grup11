$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account Activity Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"username\" \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enters(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"Account Activity\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryStepDefs.the_user_is_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify drop down options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user should be able to see following options",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefs.the_user_should_be_able_to_see_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c[Savings, Checking, Loan, Credit Card, Brokerage]\u003e but was:\u003c[Savings, Checking, Savings, Loan, Credit Card, Brokerage]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.AccountActivityStepDefs.the_user_should_be_able_to_see_following_options(AccountActivityStepDefs.java:28)\r\n\tat ✽.the user should be able to see following options(file:///C:/Users/Admin/IdeaProjects/zerobank-automation/src/test/resources/features/AccountActivity.feature:15)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});