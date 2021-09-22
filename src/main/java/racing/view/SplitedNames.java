package racing.view;

import java.util.Arrays;
import java.util.stream.Stream;

public class SplitedNames {

    private final String[] names;

    private SplitedNames(String input) {
        this.names = input.split(",");
    }

    public static SplitedNames of(String input) {
        return new SplitedNames(input);
    }

    public Stream<String> stream() {
        return Arrays.stream(names);
    }
}
