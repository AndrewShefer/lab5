package ru.shefer.lab5.classes;

import org.junit.Test;
import ru.shefer.lab5.*;
import static org.junit.Assert.*;

public class HexagonTest {

    @Test
    public void testPerimeter() {
        System.out.println("Проверка метода perimeter()");
        Hexagon p = new Hexagon(new Point(1, 1), new Point(2, 1), new Point(3, 3), new Point(3, 4), new Point(2, 4), new Point(1, 2));
        assertEquals(8.47, p.perimeter(), 0.01);
    }
}
