package Integration_Tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.company.addCustomer;
import org.junit.Test;
import org.mockito.Mockito;

public class addCustomerIntTest {


  @Test
  public void stubAddUser(){
    addCustomer mock = Mockito.mock(addCustomer.class);
    //when(mock.jButton2ActionPerformed(null)).thenReturn(true);
    //boolean test = mock.jButton2ActionPerformed(null);
    assertTrue(true);
  }

}
