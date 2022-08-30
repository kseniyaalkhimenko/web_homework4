import org.example.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyTest {

    Triangle triangle = new Triangle();

    @Test
    @DisplayName("Positive test normal triangle expected result")
    void positiveExpectedResult() {
        Assertions.assertEquals(triangle.sTriangle(3, 4, 5), 6);
    }

    @Test
    @DisplayName("Negative test normal triangle not expected result")
    void negativeExpectedResult() {
        Assertions.assertNotEquals(triangle.sTriangle(3, 4, 5), 12);
    }

    @Test
    @DisplayName("Exception - can't make a triangle with such values")
    void exceptionNotTriangle() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> triangle.sTriangle(1, 2, 4));
        Assertions.assertEquals("Can't make a triangle with such sides", exception.getMessage());
    }

    @Test
    @DisplayName("Exception - can't make a triangle with negative values")
    void exceptionIncorrectValues() {
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> triangle.sTriangle(-1, 0, 4));
        Assertions.assertEquals("Sides values must be positive", exception.getMessage());
    }
}
