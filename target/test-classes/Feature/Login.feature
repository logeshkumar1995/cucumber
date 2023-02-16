Feature: verify adactin login details

  Scenario Outline: verify adactin login with valid data
    Given user is on the adactin page
    When user should enter "<userName>" and "<password>"
    And user should click login button
    Then user should verify after login success message
    And user enter search hotel page "<location>","<hotels>","<roomtype>" "<noOfRooms>""<checkindate>" "<checkoutdate>" "<adultsPerRoom>" "<childrensPerRoom>"
    And user should click search button
    And user should click radio and continue button
    And user should book a data in hotel page "<firstNmae>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    And user should enter order id

    Examples: 
      | userName    | password   | location    | hotels         | roomtype | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom | firstNmae | lastName | billingAddress | creditCardNo     | creditCardType | expiryMonth | expiryYear | cvvNumber |
      | logeshkumar | logesh1234 | Sydney      | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | New York    | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | Melbourne   | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | Brisbane    | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | Adelaide    | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | London      | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | Los Angeles | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | Paris       | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | Adelaide    | Hotel Creek    | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
      | logeshkumar | logesh1234 | Melbourne   | Hotel Sunshine | Deluxe   | 2 - Two   | 03/01/2023  | 04/01/2023   | 2 - Two       | 1 - One          | Logesh    | S        | Sivagangai     | 1234567890098760 | Master Card    | December    |       2022 |     34567 |
