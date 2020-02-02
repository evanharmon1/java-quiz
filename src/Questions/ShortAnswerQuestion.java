package Questions;

import java.util.Scanner;

public class ShortAnswerQuestion extends TextualAnswerQuestion {

    @Override
    public boolean isValid(String userAnswer) {
        return userAnswer.length() <= 80;
    }

    @Override
    public void printInvalidAnswerMessage() {
        System.out.println("Answer too long. Please enter an answer 80 characters or less.");
    }
}
