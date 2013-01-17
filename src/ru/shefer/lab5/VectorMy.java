package ru.shefer.lab5;

import ru.shefer.lab5.interfaces.*;

public class VectorMy {

    private double dx;
    private double dy;

    public VectorMy(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }
}
