package fr.uvsq.cprog.zhengyao;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ComplexTest {
    Complex unComplex;

    @BeforeEach
    public void setup() {
        unComplex = new Complex(4, 6);
    }

    @Test
    @DisplayName("(1+2i) + (3+4i) = (4+6i)")
    public void addTwoComplex() {
        var cplx1 = new Complex(1, 2);
        var cplx2 = new Complex(3, 4);
        assertEquals(unComplex, cplx1.add(cplx2), "(1+2i) + (3+4i) should be (4+6i)");
    }

    @Test
    public void addaComplexAndNull() {
        var cplx1 = new Complex(1, 2);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> cplx1.add(null));
        assertEquals("Parameter can not be null.", exception.getMessage());
    }
}
