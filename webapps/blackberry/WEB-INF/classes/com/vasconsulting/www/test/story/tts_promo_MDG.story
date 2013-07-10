TTS Promo Airtel Madagascar

Narrative:
In order to get the BB TTS promo
As a Subscriber
I want to send the promo shortcode to get the blackberry Voice, SMS, and Data bundle
					 
Scenario: Subscriber sends request for TTS promo, subscriber is qualified for the promo and promo is successful
Given Subscriber sends $promo_shortcode
When Subscriber $MSISDN exist in msisdnwhitelist table
Then Broker gets IMEI from EMA
When Broker Checks if Subscriber $IMEI exist in imeiwhitelist table (first 14 digits of the subscriber IMEI matches first 14 digits of any IMEI in the imeiwhitelist table) 
Then Broker checks Subscriber Status in its DB 
Then Broker gets Subscriber $IMSI from EMA
Then Broker checks if the Subscriber Status on RIM 
Then Broker sets Susbriber APN on EMA
Then Broker provisions $configured_plan on RIM
Then Broker assigns configured $amount in subscriber's DA account for voice
Then Broker assigns configured $amount in subscriber's DA account for SMS
Then Broker assigns configured $amount in subscriber's DA account for Data and sets subscriber expiry date
Then Broker updates msisdnwhitelist table with "status = used and use_date = new GregorianCalendar"
Then Broker updates imeiwhitelist table with "status = used and use_date = new GregorianCalendar"
Then Broker inserts subscriber record in the ttspromo table
Then Broker inserts subcriber record in the subscriber table

Scenario: Subscriber sends request for TTS promo, subscriber MSISDN is qualified but susbcriber IMEI is not qualified (subscriber sending request from a different device)
Given Subscriber sends $promo_shortcode
And Subscriber $MSISDN exist in msisdnwhitelist table
But Subscriber $IMEI does not exist in imeiwhitelist table
Then CheckForValidIMEI returns with an invalid IMEI error code
Then SendSmsToKannelService sends "You are using a device that is not permitted"

Scenario: Subscriber sends request for TTS promo, subscriber IMEI is qualified but susbcriber MSISDN is not qualified (subscriber sending request from a different number)
Given Subscriber sends $promo_shortcode
And Subscriber $MSISDN exist in msisdnwhitelist table
But Subscriber $IMEI does not exist in imeiwhitelist table
Then CheckForValidMSISDN returns with an invalid MSISDN error code
Then SendSmsToKannelService sends "You are using a number that is not permitted"

Scenario: Subscriber sends request for TTS promo, but failure occurs in RIM provisioning (Network Failure)
Given Subscriber sends $promo_shortcode
And Subscriber $MSISDN exist in msisdnwhitelist table
And Subscriber $IMEI exist in imeiwhitelist table (first 14 digits of the subscriber IMEI matches first 14 digits of any IMEI in the in the imeiwhitelist table)
Then Broker gets Subscriber $IMSI from EMA
Then Broker checks if the Subscriber Status on RIM
Then Broker sets Susbriber APN on EMA
Then Broker provisions configured plan on RIM
But Provisioning fails on RIM
Then CreateBlackberryServiceImpl returns with a OTHER_ERRORS error code
Then Broker removes the APN set on EMA
Then Broker sends "We are sorry some error occured please try again"


Scenario: Subscriber sends request for TTS promo, but has an active subscription on Broker
Given Subscriber sends $promo_shortcode
And Subscriber $MSISDN exist in msisdnwhitelist table
And Subscriber $IMEI exist in imeiwhitelist table (first 14 digits of the subscriber IMEI matches first 14 digits of any IMEI in the
Then Broker checks Subscriber Status in its DB
But Subscriber has an active Subscription in Broker DB
Then Broker sends "We are sorry you cannot use this plan when you have an active subscription"

Scenario: Subscriber sends request for TTS promo, but has an active subscription on RIM
Given Subscriber sends $promo_shortcode
And Subscriber $MSISDN exist in msisdnwhitelist table
And Subscriber $IMEI exist in imeiwhitelist table (first 14 digits of the subscriber IMEI matches first 14 digits of any IMEI in the
Then Broker checks Subscriber Status in its DB
Then Broker gets Subscriber $IMSI from EMA
Then Broker checks if the Subscriber Status on RIM
But Subscriber has an active Subscription on RIM
Then CheckSubscriberBlackberryServiceImpl returns with a OTHER_ERRORS error code
Then Broker sends "We are sorry you cannot use this plan when you have an active subscription"



