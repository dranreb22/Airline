package test;

import com.company.User;
import com.company.userCreation;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.junit.Assert;

import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class userCreationIntegrationTest {
    private User testUser;

    @Test
    public void mockTestUserCreation() {
        User testUser = mock(User.class);

        //set the username and password fields to acceptable values.
        when(testUser.getUsername()).thenReturn("Christ");
        when(testUser.getPassword()).thenReturn("123456");

        testUser.getUsername();

        //return true for a valid username and password length of 6-15 characters in length.
        Assert.assertTrue(String.valueOf(testUser.getUsername().length() >= 6), testUser.getUsername().length() <= 15);
        Assert.assertTrue(String.valueOf(testUser.getPassword().length() >= 6), testUser.getPassword().length() <= 15);
    }



    @Test
    public void stubTestUserCreation(){
        userCreation createUser = new userCreation();
        User userCreation = new User("Christtest","Thorntest","", "usernametest", "passwordtest");

        createUser.setTxtFirstName(userCreation.getFirstname());
        createUser.setTxtLastName(userCreation.getLastname());
        createUser.setTxtID(userCreation.getId());
        createUser.setUserName(userCreation.getUsername());
        createUser.setPassword(userCreation.getPassword());

        //create a new user
    createUser.jButton1ActionPerformed(null);


    }

}
