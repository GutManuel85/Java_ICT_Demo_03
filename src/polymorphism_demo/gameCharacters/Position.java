package polymorphism_demo.gameCharacters;

public class Position {

    private float positionX;
    private float positionY;

    public Position(float positionX, float positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                '}';
    }

    public float getPositionX() {
        return positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }
}
