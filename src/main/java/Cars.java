import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(Car... cars) {
        this.carList = new ArrayList<>();
        carList.addAll(Arrays.asList(cars));
    }
}
