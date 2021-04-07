package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.company.addCustomer;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class addCustomerIntTest {


  @Test
  public void mockAddUser(){
    addCustomer mock = Mockito.mock(addCustomer.class);
    when(mock.jButton2ActionPerformed(null)).thenReturn(true);
    boolean test = mock.jButton2ActionPerformed(null);
    assertTrue(test);
  }

}
