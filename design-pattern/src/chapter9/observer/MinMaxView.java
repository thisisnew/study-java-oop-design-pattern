package chapter9.observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer{

    private final ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        List<Integer> scoredRecord = scoreRecord.getScoredRecord();
        displayMinMax(scoredRecord);
    }

    private void displayMinMax(List<Integer> scoredRecord) {
        int min = Collections.min(scoredRecord, null);
        int max = Collections.max(scoredRecord, null);
        System.out.println("Min: " + min + " Max: " + max);
    }
}
