package racing.domain;

import racing.view.CarDTO;

import java.util.List;
import java.util.stream.Collectors;

public class RacingResult {
    private final List<CarDTO> carDTOList;

    private RacingResult(final List<CarDTO> carDTOList) {
        this.carDTOList = carDTOList;
    }

    public static RacingResult from(final List<CarDTO> carDTOList) {
        return new RacingResult(carDTOList);
    }

    public List<CarDTO> findCurrentWinners() {
        int maxPosition = carDTOList.stream()
                .mapToInt(CarDTO::getPosition).max().orElseThrow(RuntimeException::new);

        return carDTOList.stream()
                .filter(carDTO -> carDTO.isPosition(maxPosition))
                .collect(Collectors.toList());
    }
}
