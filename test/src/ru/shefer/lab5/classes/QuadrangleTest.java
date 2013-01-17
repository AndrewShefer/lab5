package ru.shefer.lab5.classes;

import org.junit.Test;
import ru.shefer.lab5.*;
import static org.junit.Assert.*;

public class QuadrangleTest {

    @Test
    public void testPerimeter() {
        System.out.println("Проверка метода perimeter()");
        Quadrangle p = new Quadrangle(new Point(1, 1), new Point(2, 1), new Point(2, 2), new Point(1, 2));
        assertEquals(4, p.perimeter(), 0.00001);
    }
}
