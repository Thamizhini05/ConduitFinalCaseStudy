Feature: Article Page Function
 
Scenario: Invalid Login into app
Given User is on login Page
When User enters inValid Credentials
      |email|password|
      |thamizhinika.20it@kongu.edu|123tami|
Then Should display the invalid login message
      |Wrong email/password combination|
  
Scenario: Valid Login into app
Given User is on login Page
When User enters  valid Credentials
      |email|password|
      |thamizhinika.20it@kongu.edu|123tamil|
Then Should display the success login message
      |Thamizhini Athiappan|
 
Scenario: User Create the Article with duplicate Title
Given User is on newArticleCreationPage
When   User Create the duplicate article
       |articleTitle|description|body|tags|
       |Automation Testing|Needs of Automation Testing|Automation Tester|Testing|
Then   Should display the duplicate article message
       |Title already exists..|
 
Scenario: User Create the new Article
Given User is on newArticleCreationPage
When User create the new Article
       |articleTitle | description | body | tags |
       |Testing in IT | Importance of Testing | Testing makes the major role in IT field | Testing |
Then Should display the new Article Title
       |Testing in IT|
 
Scenario: User update the Article
Given User is on updateArticlePage
When User Update the Article
      |articleTitle|updatedArticleTitle|description | body | tags |
      |Testing in IT|Role of Testing|About Testing|Testing Projects|Benefits of Testing|
Then Should display the updated Article Title
      |Role of Testing|
 
Scenario: User delete the Article
Given User is on deleteArticlePage
When User delete the Article
      |articleName|
      |Role of Testing|
Then Should the article to be deleted
      |Articles not available.|