package points;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getQuadrant(Point point) {
        boolean xPositive = true;
        boolean yPositive = true;
        if (point.getX() < 0) {
            xPositive = false;
        }
        if (point.getY() < 0) {
            yPositive = false;
        }
        if (xPositive) {
            if (yPositive) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (yPositive) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
