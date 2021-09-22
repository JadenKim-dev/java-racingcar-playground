package racing.domain;

import java.util.Objects;

public class Position implements Comparable{

    public static final int MIN_BOUND = 0;
    private int position;

    private Position() {
        this.position = MIN_BOUND;
    }

    public static Position newInstance() {
        return new Position();
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

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) throw new IllegalArgumentException();
        Position position1 = (Position) o;
        if(position < position1.position) return -1;
        if(position == position1.position) return 0;
        return 1;
    }

    public int get() {
        return position;
    }
}
