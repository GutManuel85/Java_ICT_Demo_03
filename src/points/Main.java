package points;

public class Main {

    public static void main(String[] args){

        CoordinateSystem coordinateSystem = new CoordinateSystem();
        coordinateSystem.addPoint(new Point(1,2));
        System.out.println(coordinateSystem.createRandomPoints(9));
        coordinateSystem.printPoints();
    }
}
