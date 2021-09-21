import java.util.Random;

public class Car {
    private final CarName name;
    private final Position position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new Position();
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new Position(position);
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
