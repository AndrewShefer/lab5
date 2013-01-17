package ru.shefer.lab5;

import ru.shefer.lab5.interfaces.*;
import java.util.Comparator;

public class SortMode implements Comparator<Polygon> {

    private boolean sortUp;
    private int sortMode;

    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }

    @Override
    public int compare(Polygon p1, Polygon p2) {
        int res = 0;
        if (sortMode == 0) {
            if (p1.getId() > p2.getId()) {
                res = 1;
            } else if (p1.getId() < p2.getId()) {
                res = -1;
            }
        } else if (sortMode == 1) {
            res = p1.getName().compareTo(p2.getName());
        } else {
            if (p1.perimeter() > p2.perimeter()) {
                res = 1;
            } else if (p1.perimeter() < p2.perimeter()) {
                res = -1;
            }
        }
        if (sortUp) {
            res *= (-1);
        }
        return res;
    }
}
