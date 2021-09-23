package racing.domain;

import racing.view.CarDTO;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class RacingResults {

    private final List<RacingResult> racingResultList;

    private RacingResults(List<RacingResult> racingResultList) {
        this.racingResultList = racingResultList;
    }

    public static RacingResults of(List<RacingResult> racingResultList) {
        return new RacingResults(racingResultList);
    }

    public List<CarDTO> findWinners() {
        RacingResult lastResult = racingResultList.get(racingResultList.size() - 1);
        return lastResult.findCurrentWinners();
    }

    public Iterator<RacingResult> iterator() {
        return racingResultList.iterator();
    }


}
