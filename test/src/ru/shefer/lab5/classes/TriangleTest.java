package ru.shefer.lab5.classes;

import org.junit.Test;
import ru.shefer.lab5.*;
import ru.shefer.lab5.main.*;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testPerimeter() {
        Triangle p = new Triangle(new Point(1, 1), new Point(2, 1), new Point(2, 2), "as");
        assertEquals(3.41, p.perimeter(), 0.01);
    }
}
