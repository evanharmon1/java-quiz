package Questions;

import javax.crypto.AEADBadTagException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class PossibleAnswersQuestion extends Question {

    private String correctAnswer;
    private Integer correctChoice;
    private List<String> possibleAnswers = new ArrayList<>();

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.addPossibleAnswer(correctAnswer);
    }

    public <T> T getCorrectChoice() {
        return (T) correctChoice;
    }

    public void setCorrectChoice(int correctChoice) {
        this.correctChoice = correctChoice;
    }

    public void askQuestion() {
        displayQuestion();
        System.out.println("Type the number next to the correct answer");
        int possibleAnswerNumber = 1;
        for (String possibleAnswer : getPossibleAnswers()) {
            if (possibleAnswer.equals(correctAnswer)) {
                correctChoice = possibleAnswerNumber;
            }
            System.out.println(possibleAnswerNumber++ + ") " + possibleAnswer);
        }
    }

    public abstract <T> T getUserAnswer(Scanner in);

    public abstract <T> boolean checkAnswer(T t);

    public List<String> getPossibleAnswers() {
        Collections.shuffle(this.possibleAnswers);
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public void addPossibleAnswer(String possibleAnswer) {
        this.possibleAnswers.add(possibleAnswer);
    }
}
