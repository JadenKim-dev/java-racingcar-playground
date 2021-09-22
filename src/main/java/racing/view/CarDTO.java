package racing.view;

import racing.domain.Car;

public class CarDTO {
    private String name;
    private String position;

    private CarDTO(Car car) {
        this.name = car.getName().get();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < car.getPosition().get(); i++) {
            sb.append("-");
        }
        this.position = sb.toString();
    }

    public static CarDTO from(Car car) {
        return new CarDTO(car);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " : " + position;
    }
}
