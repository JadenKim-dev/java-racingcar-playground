package racing.domain;

import racing.domain.strategy.RacingStrategy;

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

    public boolean isPositionLargerThan(Position position) {
        return this.position.compareTo(position) > 0;
    }

    public boolean isPositionSameAs(Position position) {
        return this.position.compareTo(position) == 0;
    }

    public CarName getName() {
        return name;
    }
}
