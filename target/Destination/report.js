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
  "name": "user hoover over category \"Computers\" link",
  "keyword": "When "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userHooverOverCategoryLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on subcategory \"Notebooks\" link",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.clickOnSubcategoryLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to navigate to subcategory page \"notebooks\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepDefs.userShouldBeAbleToNavigateToSubcategoryPageSuccessfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});