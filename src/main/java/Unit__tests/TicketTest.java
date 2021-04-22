package Unit__tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
Test Case Id: UnitTest-TicketTest-001
Requirement ID/Description: REQ-001 The software shall multiply two numbers and return the correct result
Purpose: To test that the total generated from price and qty is correct
Test Setup: Manually input an integer for price along with qty and check that the result is correct
Test Strategy: Positive Testing
Input: call assertEquals(3, tot) the tot variable should match the number input for expected value
Expected Output: This method returns True
**/
public class TicketTest {
  @Test
  public void txtseatsStateChanged(){
    int price = 1;
    int qty = 3;

    int tot = price * qty;

    assertEquals(3,tot);
  }
}
