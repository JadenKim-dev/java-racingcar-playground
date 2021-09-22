public class CarName {
    private final String name;

    public CarName(String name) {
        if(!validateName(name)) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    private boolean validateName(String name) {
        return name.length() > 0 && name.length() <= 5;
    }

    public String get() {
        return name;
    }
}
