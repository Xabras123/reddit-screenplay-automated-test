@Feature2

Feature: Functionality -Create a personal post on the profile page
  AS a correoPruebasTesting123@gmail.com user
  I want to create a personal post
  To let people interact with it

  Background: Open the browser on the Reddit and page access with correoPruebasTesting123@gmail.com credentials, and create a personal post
    Given that Accenture testing enters with userForUITesting and correoPruebasTesting456_

  @CreatePersonalPost
  Scenario: TEST TO BE PERFORMED - Create a personal post on the profile page
    When user wants to create a personal post with the message this is a test title and an image in path C:\Users\a.mayorga.cortes\Documents\Workspace-Java\reddit-screenplay-automated-test\src\main\resources\images\test.jpeg
    Then user expect for the post to be visible on the personal posts sections of the profile