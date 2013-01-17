package ru.shefer.lab5;

import ru.shefer.lab5.interfaces.*;

public class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return " (" + x + "," + y + ") ";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void doSummetry() {
        x = -x;
        y = -y;
    }

    public void doMove(VectorMy np) {
        x += np.getDx();
        y += np.getDy();
    }
}
