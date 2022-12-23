Feature:Testing orange hrm

Scenario:To test the login page of orange hrm

Given Enter User should be in login page

When Enter the valid username "Admin" 
And Enter the valid password "admin123"
And Click on login button 

Then I should get the title of Orange hrm "OrangeHRM" 