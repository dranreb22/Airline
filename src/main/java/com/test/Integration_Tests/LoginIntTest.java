package com.test.Integration_Tests;

import com.company.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginIntTest {
  private User user;

  @Before
  public void setUp() {
    user = new User("username", "password");
  }

  @After
  public void after() throws Exception {}

  /** Method: main(String[] args) */
  @Test
  public void isEmptyLoginStub() throws Exception {
      User test = mock(User.class);
      when(test.getUsername()).thenReturn("Gui_tests");
      when(test.getPassword()).thenReturn("pass");

    Assert.assertNotNull(test.getUsername());
    Assert.assertNotNull(test.getPassword());
  }
}
