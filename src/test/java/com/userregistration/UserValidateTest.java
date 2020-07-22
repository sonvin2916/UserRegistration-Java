package com.userregistration;
import com.uservalidate.UserValidate;
import org.junit.Assert;
import org.junit.Test;

public class UserValidateTest {
    @Test
    public void givenFirstName_WithCaps_ShouldReturnTrue()
    {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateFirstName("Sonal");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WithMininum_ThreeCharacters_ShouldReturnFalse()
    {
        UserValidate validate=new UserValidate();
        boolean result = validate.validateFirstName("So");
        Assert.assertEquals(false,result);
    }
}
