package Questions;

import java.util.Scanner;

public abstract class BinaryQuestion extends Question {

    private boolean correctAnswer;

    public boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void askQuestion() {
        super.displayQuestion();
    }

    public boolean checkAnswer(boolean actualAnswer) {
        return actualAnswer == correctAnswer;
    }

}
