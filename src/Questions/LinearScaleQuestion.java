package Questions;

import java.util.Scanner;

public class LinearScaleQuestion extends Question {

    private int correctAnswerLowerBound;
    private int correctAnswerUpperBound;

    @Override
    public void askQuestion() {
        displayQuestion();
    }

    public int getCorrectAnswerLowerBound() {
        return correctAnswerLowerBound;
    }

    public void setCorrectAnswerLowerBound(int correctAnswerLowerBound) {
        this.correctAnswerLowerBound = correctAnswerLowerBound;
    }

    public int getCorrectAnswerUpperBound() {
        return correctAnswerUpperBound;
    }

    public void setCorrectAnswerUpperBound(int correctAnswerUpperBound) {
        this.correctAnswerUpperBound = correctAnswerUpperBound;
    }

    public int getUserAnswer(Scanner in) {
        int userAnswer = in.nextInt();
        in.nextLine();
        return userAnswer;
    }

    public boolean checkAnswer(int userAnswer) {
        return (userAnswer <= correctAnswerUpperBound) && (userAnswer >= correctAnswerLowerBound);
    }

}
