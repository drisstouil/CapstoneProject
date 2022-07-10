@test
  Feature: Retail Page 
  Background:
  Given User is on Retail website 
  And User click  on MyAccount
  When  User click on Login 
  And User enter username 'userName'and password 'password'
  And User click on Login button
  Then User should be logged in to MyAccount dashboard
  #@Chequepayment
  #@test1
  Scenario: Register as an Affiliate user with Cheque Payment Method
  When User click on 'Register for an Affiliate Account'link 
  And User fill affiliate form with below information
  |company|website|taxID|paymentMethod|payeeName|
  |casablanca|www.casablanca|01234|cheque|test|
  And User check on About us check box 
  And User click on Continue button 
  Then User should see a success message
  #@banktransfer
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
  When User click on Edit your affiliate information link 
  And user click on Bank Transfer radio button
  And User fill Bank information with below information
  |bankName|abaNumber|swiftCode|accountName|accountNumber|
  |bankofamerica|123456|2345|patrix|0123456|
  And User click on Continue button 
  Then User should see a success message 
  #editaccountinfo
  Scenario: Edit your account Information 
  When User click on 'Edit your account information'link 
  And User modify below information 
  |firstName|lastName|email|telephone|
  |driss|touil|patrixdriss7000@gmail.com|2525990999|
  And User click on continue button 
  Then User should see a message 'Success: Your account has been successfully updated.'