package com.bridgelabz;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    RegularExpression userValidatorTest = new RegularExpression();

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.checkName("Jaya");
        Assertions.assertEquals(true,result);}

    @org.junit.jupiter.api.Test
    public void givenFirstName_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.checkName("jaya");
        Assertions.assertEquals(true,result);}
    @org.junit.jupiter.api.Test

    public void givenFirstName_whenProperShouldReturnFalse() {
        boolean result = userValidatorTest.checkName("Jo");
        Assertions.assertEquals(false,result);}
    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.checkName("Jay");
        Assertions.assertEquals(true,result);}
    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.checkName("jay");
        Assertions.assertEquals(true,result);}
    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.checkMobileNumber("91 1235468844");
        Assertions.assertEquals(true, result);}
    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.checkMobileNumber("+91-1235468844");
        Assertions.assertEquals(false, result);}
    @org.junit.jupiter.api.Test

    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.checkPassword("Ja@xyzzss1");
        Assertions.assertEquals(false, result);}
    @org.junit.jupiter.api.Test

    public void givenEmailId_ValidShould_ReturnTrue() {
        boolean result = userValidatorTest.checkEmail("abc100@gmail.com.");
        Assertions.assertEquals(false, result);
    }
    @org.junit.jupiter.api.Test
    public void givenEmailId_ValidShould_ReturnFalse() {
        boolean result = userValidatorTest.checkEmail("abc-100.@.gmail.com");
        Assertions.assertEquals(false, result);
    }

}