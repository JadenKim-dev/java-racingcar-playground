package racing.domain;

public class RepeatNumber {
    private final int num;

    private RepeatNumber(int num) {
        this.num = num;
    }

    public static RepeatNumber of(int num) {
        return new RepeatNumber(num);
    }

    public int get() {
        return num;
    }
}
