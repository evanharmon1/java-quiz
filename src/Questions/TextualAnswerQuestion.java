package Questions;

import java.util.Scanner;

public abstract class TextualAnswerQuestion extends Question {
    private String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getUserAnswer(Scanner in) {
        return in.nextLine();
    }

    public boolean checkAnswer(String userAnswer) {
        return userAnswer.equals(correctAnswer);
    }

    public abstract boolean isValid(String userAnswer);
}
