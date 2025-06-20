package validator.tests;


import org.junit.jupiter.api.Test;
import validator.utils.PasswordValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isStrong("Qwerty0!"));
        assertTrue(PasswordValidator.isStrong("Qwerty0?"));
        assertTrue(PasswordValidator.isStrong("Qwerty0@"));
        assertTrue(PasswordValidator.isStrong("Qwerty0#"));
           }

    @Test
    void testSybolsLessThan8() {
        assertFalse(PasswordValidator.isStrong("Qwerty0!"));

    }
    @Test
    void testInvalidSpecSymbols() {
        assertFalse(PasswordValidator.isStrong("Qwerty0"));
        assertFalse(PasswordValidator.isStrong("Qwe^rty0"));
        assertFalse(PasswordValidator.isStrong("~Qwerty0"));

    }
    @Test
    void testNoUpperCase(){
        assertFalse(PasswordValidator.isStrong("qwerty2!"));
    }

}