package Questions;

import java.util.Scanner;

public class ShortAnswerQuestion extends TextualAnswerQuestion {

    @Override
    public void askQuestion() {
        displayQuestion();
    }

    @Override
    public boolean isValid(String userAnswer) {
        return userAnswer.length() <= 80;
    }
}
