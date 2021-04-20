@Feature2

  Feature: Functionality -Join Subreddit
    AS a correoPruebasTesting123@gmail.com user
    I want to join a subreddit
    To recive feeds from it

  Background: Open the browser on the Reddit and page access with correoPruebasTesting123@gmail.com credentials, and click on the first visible post
    Given that Accenture testing enters with userForUITesting and correoPruebasTesting456_

    @JoinSub
    Scenario: TEST TO BE PERFORMED - Join a subreddit from the main page.
      When user wants to join a subreddit named r/Instagramreality
      Then user expect for the 'My Communities' section to have the new item