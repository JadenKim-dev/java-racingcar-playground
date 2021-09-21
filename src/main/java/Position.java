import java.util.Objects;

public class Position {

    public static final int MIN_BOUND = 0;
    private int position;

    public Position() {
        this.position = MIN_BOUND;
    }

    public Position(int position) {
        if(position < MIN_BOUND) {
            throw new IllegalArgumentException();
        }
        this.position = position;
    }

    public void go() {
        position++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
