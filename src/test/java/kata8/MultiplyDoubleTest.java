package kata8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyDoubleTest {

    final private MultiplyDouble multiplyDouble = new MultiplyDouble();

    @Test
    void multiply() {

        final var actual = multiplyDouble.multiply(1.64456, 0.2342);

        assertEquals(0.385155952, actual);
    }
}