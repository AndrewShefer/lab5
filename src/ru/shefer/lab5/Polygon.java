package ru.shefer.lab5;

import ru.shefer.lab5.interfaces.*;

public abstract class Polygon {

    public Point p1;
    public Point p2;
    public Point p3;
    private int id;
    private static int nextId = 1;
    private String name;

    {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double perimeter();

    public double lengthSegment(Point p1, Point p2) {
        double a1;
        a1 = Math.abs(p2.getY() - p1.getY());
        double a2;
        a2 = Math.abs(p2.getX() - p1.getX());
        double res;
        res = Math.sqrt(a1 * a1 + a2 * a2);
        return res;
    }

    public abstract void doSummetry();

    public abstract void doMove(VectorMy np);
}
