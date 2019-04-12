Feature: Swiggy
@smoke
  Scenario: Order From Bite Me
    Given Navigate to ​Swiggy
      Then Enter delivery location as ​Indiranagar​, ​Bengaluru
      Then Select first result which is ​Indiranagar, Bengaluru, Karnataka, India
      And Click on ​Search
      Then Search for Restaurant called ​“Bite Me” ​and Click on it
      When Restaurant loaded, Add few items to the cart
      Then  Click on Checkout
      And  Verify Items added in checkout page
      Then Click on ​“New to Swiggy SIGN UP
      And Enter Details for cehckout
      But Error message at Email field ​“Email id already exists”​ and  Capture screenshot
      Then  Change Red Velvet cupcake quantity to 1
      And Capture screenshot and close  browser
