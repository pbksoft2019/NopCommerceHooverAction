$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/category.feature");
formatter.feature({
  "name": "Category",
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
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userIsOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user should be able to perform hoover action",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hoover"
    }
  ]
});
formatter.step({
  "name": "user hoover over category \"Electronics\" link",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userHooverOverCategoryLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on subcategory \"Others\" link",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.clickOnSubcategoryLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to navigate to subcategory page \"Others\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat WebTest.Utils.assertURL(Utils.java:13)\r\n\tat WebTest.HomePage.userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(HomePage.java:37)\r\n\tat WebTest.MyStepDefs.userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(MyStepDefs.java:39)\r\n\tat ✽.user should be able to navigate to subcategory page \"Others\" successfully(file:///C:/Users/Prakash/IdeaProjects/NopCommerceHoover/./src/test/Resources/features/category.feature:24)\r\n",
  "status": "failed"
});
});