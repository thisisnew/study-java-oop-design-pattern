package chapter9.observer;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        scoreRecord.attach(dataSheetView);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);
        scoreRecord.attach(minMaxView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }

        scoreRecord.detach(dataSheetView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);
            scoreRecord.addScore(score);
        }

    }
}
