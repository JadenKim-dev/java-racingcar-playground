package racing.domain;

public class CarName {
    private final String name;

    private CarName(String name) {
        if(!validateName(name)) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public static CarName of(String name) {
        return new CarName(name);
    }

    private boolean validateName(String name) {
        return name.length() > 0 && name.length() <= 5;
    }

    public String get() {
        return name;
    }
}
