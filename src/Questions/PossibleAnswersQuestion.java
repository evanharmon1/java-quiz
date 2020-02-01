package Questions;

import javax.crypto.AEADBadTagException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class PossibleAnswersQuestion extends Question {

    private String correctAnswer;
    private int correctChoice;
    private List<String> possibleAnswers = new ArrayList<>();

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.addPossibleAnswer(correctAnswer);
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

    public int getUserAnswer(Scanner in) {
        int userAnswer = in.nextInt();
        in.nextLine();
        return userAnswer;
    }

    public boolean checkAnswer(int actualAnswer) {
        return actualAnswer == correctChoice;
    }

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
