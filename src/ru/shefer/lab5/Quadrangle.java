package ru.shefer.lab5;

import ru.shefer.lab5.interfaces.*;

public class Quadrangle extends Polygon {

    Point p4;

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.setName("Четыреугольник");
    }

    @Override
    public double perimeter() {
        double s1 = this.lengthSegment(p1, p2);
        double s2 = this.lengthSegment(p2, p3);
        double s3 = this.lengthSegment(p3, p4);
        double s4 = this.lengthSegment(p4, p1);
        double perimeter = s1 + s2 + s3 + s4;
        return perimeter;
    }

    @Override
    public String toString() {
        return "id=" + getId() + "\n" + getName() + " Точки многоугольника: " + p1 + " " + p2 + " " + p3 + " " + p4;
    }

    @Override
    public void doSummetry() {
        p1.doSummetry();
        p2.doSummetry();
        p3.doSummetry();
        p4.doSummetry();
    }

    @Override
    public void doMove(VectorMy v) {
        p1.doMove(v);
        p2.doMove(v);
        p3.doMove(v);
        p4.doMove(v);
    }
}
