package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TicketTest {
  @Test
  public void txtseatsStateChanged(){
    int price = 1;
    int qty = 3;

    int tot = price * qty;

    assertEquals(3,tot);


  }
}
