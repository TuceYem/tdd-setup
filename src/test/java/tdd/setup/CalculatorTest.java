package tdd.setup;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {
    @Test
    @DisplayName("should display result after adding positive numbers")
    void calculatorCanDoTwoPlusTwo() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEquals();
        assertEquals("4", calc.readScreen());
    }

    //Function which works.
    @Test
    @DisplayName("should display result after dividing a positive and negative numbers")
    void calculatorCanDivideMinusTwentyByFour() {
        Calculator calc = new Calculator();
        calc.pressNegative();
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressOperationKey("/");
        calc.pressDigitKey(4);
        calc.pressEquals();
        assertEquals("-5", calc.readScreen());
    }

    //Test that showcase error - additionally displays a zero at the front of the typed number
    @Test
    @DisplayName("should display numbers as typed in")
    void calculatorShouldDisplayAsTypedIn() {
        Calculator calc = new Calculator();
        calc.pressDigitKey(5);
        calc.pressDigitKey(5);
        assertEquals("55", calc.readScreen());
    }
}
