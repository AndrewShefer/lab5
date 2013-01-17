package ru.shefer.lab5;

import ru.shefer.lab5.interfaces.*;

public class Hexagon extends Polygon {
    
    Point p4;
    Point p5;
    Point p6;
    
    public Hexagon(Point p1, Point p2, Point p3, Point p4, Point p5, Point p6, String date) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
        customerDate = date;
        this.setName("Шестиугольник");
        
    }
    
    @Override
    public double perimeter() {
        double s1 = this.lengthSegment(p1, p2);
        double s2 = this.lengthSegment(p2, p3);
        double s3 = this.lengthSegment(p3, p4);
        double s4 = this.lengthSegment(p4, p5);
        double s5 = this.lengthSegment(p5, p6);
        double s6 = this.lengthSegment(p6, p1);
        double perimeter = s1 + s2 + s3 + s4 + s5 + s6;
        return perimeter;
    }
    
    @Override
    public String toString() {
        return "id=" + getId() + "\n" + getName() + " Точки многоугольника: " + p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5 + " " + p6 + " " + customerDate;
    }
    
    @Override
    public void doSummetry() {
        p1.doSummetry();
        p2.doSummetry();
        p3.doSummetry();
        p4.doSummetry();
        p5.doSummetry();
        p6.doSummetry();
    }
    
    @Override
    public void doMove(VectorMy v) {        
        p1.doMove(v);
        p2.doMove(v);
        p3.doMove(v);
        p4.doMove(v);
        p5.doMove(v);
        p6.doMove(v);
    }
}
