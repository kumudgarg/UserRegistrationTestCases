package com.bridgelab.userregistrationregex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationRegexTest {

    private String firstName;
    private boolean expectedValidation;
    private UserValidator userValidator;

    public UserRegistrationRegexTest(String firstName, boolean expectedValidation) {
        this.firstName = firstName;
        this.expectedValidation = expectedValidation;
    }

    @Before
    public void initiliazeObj(){
        userValidator = new UserValidator();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{ {"Kumud",true},{"kumud",false},{"kuMud",false},{"Ku",false},{"ku mud",false} });
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
       Assert.assertEquals(expectedValidation,userValidator.validateFirstName(firstName));
    }
}





