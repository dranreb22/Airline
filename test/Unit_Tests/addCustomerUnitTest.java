package Unit_Tests;

import com.company.addCustomer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class addCustomerUnitTest {



  public addCustomer addCustomer = new addCustomer();

  @Before
  public void setup(){
    addCustomer.setTxtFirstName("Bernard");
    addCustomer.setTxtLastName("Georges");
    addCustomer.setTxtNIC("1111111111");
    addCustomer.setPassportID("1111111111");
    addCustomer.setTxtID("CS1111");
    addCustomer.setTxtAddress("United States");
    addCustomer.setTxtContact(2042042004);
  }

  @Test
  public void buttonTest(){
    assertTrue(addCustomer.jButton2ActionPerformed(null));
    //assertEquals(1,1);
  }

  @Test
  public void isValidFirstNameTest() {
    assertTrue(addCustomer.isValidFirstName());
  }

  @Test
  public void isInvalidFirstNameTest() {
    addCustomer.setTxtFirstName(null);
    assertFalse(addCustomer.isValidFirstName());
  }

  @Test
  public void isValidLastNameTest() {
    addCustomer.setTxtFirstName("Bernard");
    assertTrue(addCustomer.isValidLastName());
  }



  @Test
  public void isValidNICTest() {
    addCustomer.setTxtNIC("1111111111");
    assertTrue(addCustomer.isValidNIC());
  }

  @Test
  public void isValidPassportTest() {
    addCustomer.setPassportID("1111111111");
    assertTrue(addCustomer.isValidPassport());
  }

  @Test
  public void isValidIDTest() {
    addCustomer.setTxtID("CS111");
    assertTrue(addCustomer.isValidID());
  }

}
