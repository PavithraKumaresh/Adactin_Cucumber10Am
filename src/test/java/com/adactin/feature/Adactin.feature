Feature: Testing Adactin Application end to end process


@SmokeTest
Scenario Outline: verify the user is able to login the application

Given User launch the application
When  user enter the valid username "<username>" in the username field
And user enter the valid password "<password>" in the password field
And User is able to click the login button
Then User verify the hompage navigates to search hotel


Examples:

|username|password|
|AAA|111|
|BBB|222|
|CCC|333|
|Pavikumaresh|Pavikums@24|



