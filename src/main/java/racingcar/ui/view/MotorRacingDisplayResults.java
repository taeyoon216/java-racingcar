package racingcar.ui.view;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MotorRacingDisplayResults {
    public static final String ROUND_RESULT_SEPARATOR = "\n\n";
    private List<MotorRacingDisplayRoundResult> carRaceDisplayResults;

    public MotorRacingDisplayResults() {
        this.carRaceDisplayResults = new ArrayList<>();
    }

    public void saveEachRound(MotorRacingDisplayRoundResult motorRacingDisplayRoundResult){
        carRaceDisplayResults.add(motorRacingDisplayRoundResult);
    }

    @Override
    public String toString() {
        return getCollectDisplayRoundResults() + getDisplayWinners();
    }

    private String getCollectDisplayRoundResults() {
        return carRaceDisplayResults.stream()
                                    .map(MotorRacingDisplayRoundResult::toString)
                                    .collect(Collectors.joining(ROUND_RESULT_SEPARATOR));
    }

    private String getDisplayWinners() {
        List<String> winners = MotorRacingDisplayRoundResult.getWinnerResults();
        if(winners.isEmpty()){
            return "";
        }
        return ROUND_RESULT_SEPARATOR + String.join(", ", winners) + "가 최종 우승했습니다.";
    }
}