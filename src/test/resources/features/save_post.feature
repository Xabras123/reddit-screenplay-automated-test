@Feature1

  Feature: Functionality -Save a post
    AS a correoPruebasTesting123@gmail.com user
    I want to save a post
    To read later

  Background: Open the browser on the Reddit and page access with correoPruebasTesting123@gmail.com credentials, and click on the first visible post
    Given that user Apollo enters with userForUITesting and correoPruebasTesting456_

    @SavePost
    Scenario: TEST TO BE PERFORMED - Save a post from the Reddit page.
      When user wants to save the post number 1 from the home page
      Then user expect for it to be saved on its saved post section