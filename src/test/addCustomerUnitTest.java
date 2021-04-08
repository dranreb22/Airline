package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import com.company.addCustomer;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class addCustomerUnitTest {



  public addCustomer addCustomer = new addCustomer();

  @BeforeEach
  public void initCustomer(){
    addCustomer.setTxtFirstName("Bernard");
    addCustomer.setTxtLastName("Georges");
    addCustomer.setTxtNIC("1111111111");
    addCustomer.setPassportID("1111111111");
    addCustomer.setTxtID("CS1111");
    addCustomer.setTxtAddress("United States");
  }

  @Test
  public void isValidFirstNameTest() {
    addCustomer.setTxtFirstName("Bernard");
    assertTrue(addCustomer.isValidFirstName());
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
