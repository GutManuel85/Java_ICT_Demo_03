package points;

import java.util.ArrayList;

public class CoordinateSystem {

    private ArrayList<Point> points;

    public CoordinateSystem() {
        this.points = new ArrayList<>();
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public boolean addPoint(Point point) {
        return points.add(point);
    }

    public boolean remove(Point point) {
        return points.remove(point);
    }

    public boolean createRandomPoints(int amount) {
        if (amount > 0) {
            for (int i = 0; i < amount; i++) {
                this.addPoint(new Point((int) (Math.random() * 10), (int) (Math.random() * 10)));
            }
            return true;
        } else {
            return false;
        }
    }

    public void printPoints(){
        this.points.forEach(System.out::println);
    }

    public String[][] createTwoDimensionalArray(){
        String[][] array = new String[20][20];
        this.points.forEach(point -> array[point.getX()][point.getY()] = "o");
        return array;
    }
}
