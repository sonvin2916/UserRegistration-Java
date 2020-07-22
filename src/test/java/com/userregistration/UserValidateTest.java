package com.userregistration;
import com.uservalidate.UserValidate;
import org.junit.Assert;
import org.junit.Test;

public class UserValidateTest
{
    @Test
    public void givenFirstName_WithCaps_ShouldReturnTrue()
    {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateFirstName("Sonal");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_LessThan_ThreeCharacters_ShouldReturnFalse()
    {
        UserValidate validate=new UserValidate();
        boolean result = validate.validateFirstName("So");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenLastName_WithCaps_ShouldReturnTrue()
    {
        UserValidate validate= new UserValidate();
        boolean result = validate.validateLastName("Chougule");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastName_LessThan_ThreeCharacter_ShouldReturnFalse()
    {
        UserValidate validate=new UserValidate();
        boolean result = validate.validateFirstName("Ch");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenEmail_IfValid_ShouldReturnTrue()
    {
        UserValidate validate = new UserValidate();
        boolean result=validate.validateEmail("sonalchougule07@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_IfInvalid_ShouldReturnFalse()
    {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateEmail("abc.xyz@com");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenMobileNumber_WhenCorrectFormat_ShoulReturnTrue()
    {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateMobileNumber("91 7895412869");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenMobileNumber_WhenIncorrect_ShoulReturnTrue()
    {
        UserValidate validate = new UserValidate();
        boolean result = validate.validateMobileNumber("91 785496");
        Assert.assertEquals(false,result);
    }

}
