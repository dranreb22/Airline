package Unit_Tests;

import com.company.Login;
import com.company.addCustomer;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class LoginUnitTest {

  Login loginTest = new Login();

  @Test
  public void cancelButtonTest(){
    loginTest.jButton2.doClick();
    assertTrue(loginTest.cancelButtonClicked(null));
  }
}
