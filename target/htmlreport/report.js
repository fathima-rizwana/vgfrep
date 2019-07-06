$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "login into TestMeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "click on signin",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters uname \"\u003cuname\u003e \"",
  "keyword": "When "
});
formatter.step({
  "name": "user enters password \"\u003cpassword\u003e \"",
  "keyword": "When "
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.step({
  "name": "verify successful login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "uname",
        "password"
      ]
    },
    {
      "cells": [
        "lalitha",
        "password123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "click on signin",
  "keyword": "Given "
});
formatter.match({
  "location": "Case_2.click_on_signin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters uname \"lalitha \"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_2.user_enters_uname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password \"password123 \"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_2.user_enters_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "And "
});
formatter.match({
  "location": "Case_2.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "Case_2.verify_successful_login()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/cart.feature");
formatter.feature({
  "name": "check cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User moves to cart without adding any item to it",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Alex has registered into TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "Case_4.alex_has_registered_into_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alex search for particular item like headphone",
  "keyword": "When "
});
formatter.match({
  "location": "Case_4.alex_search_for_particular_item_like_headphone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "try to proceed to payment without adding any item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "Case_4.try_to_proceed_to_payment_without_adding_any_item_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TestMeApp does not display cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "Case_4.testmeapp_does_not_display_cart_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/register.feature");
formatter.feature({
  "name": "register to TestMe app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "register with valid details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "opens TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "Case_1.opens_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on signup page",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.the_user_clicks_on_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username as \"ffrriiiizzwana\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters firstname as \"fathima\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_firstname_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters lastname as \"rizwana\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_lastname_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password as \"frizwana\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters confirm password as \"frizwana\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_confirm_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on gender as female",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_clicks_on_gender_as_female()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters email as \"frizwana@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters mobile number as \"7654321890\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_mobile_number_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters DOB as \"11/02/1998\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_DOB_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters address as \"chennai\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects security  question",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_selects_security_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Answer as \"chennai\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_1.user_enters_Answer_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on register button",
  "keyword": "And "
});
formatter.match({
  "location": "Case_1.user_clicks_on_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify registration success",
  "keyword": "Then "
});
formatter.match({
  "location": "Case_1.verify_registration_success()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/search.feature");
formatter.feature({
  "name": "search engine",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search for an item",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters un and pwd",
  "keyword": "Given "
});
formatter.match({
  "location": "Case_3.user_enters_un_and_pwd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the name of item \"head\"",
  "keyword": "When "
});
formatter.match({
  "location": "Case_3.user_enters_the_name_of_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on find details",
  "keyword": "When "
});
formatter.match({
  "location": "Case_3.user_clicks_on_find_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify search engine",
  "keyword": "Then "
});
formatter.match({
  "location": "Case_3.verify_search_engine()"
});
formatter.result({
  "status": "passed"
});
});