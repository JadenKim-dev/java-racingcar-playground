import java.util.Random;

public class Car {
    private final CarName name;
    private Position position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
    }

    public void go(RacingStrategy strategy) {
        if(strategy.goOrStop()) {
            this.position.go();
        }
    }

    public Position getPosition() {
        return position;
    }
}
