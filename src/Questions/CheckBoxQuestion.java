package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CheckBoxQuestion extends PossibleAnswersQuestion {

    private List<String> correctAnswers = new ArrayList<>();
    private List<Integer> correctChoice = new ArrayList<>();

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public List<Integer> getCorrectChoice() {
        return correctChoice;
    }

    public void addCorrectAnswer(String correctAnswer) {
        this.correctAnswers.add(correctAnswer);
        this.addPossibleAnswer(correctAnswer);
    }

    public void setCorrectChoice(List<Integer> correctChoice) {
        this.correctChoice = correctChoice;
    }

    public void addCorrectChoice(int correctChoice) {
        this.correctChoice.add(correctChoice);
    }

    @Override
    public void askQuestion() {
        displayQuestion();
        System.out.println("Type the number next to EACH correct answer and press enter. Enter 0 when finished.");
        int possibleAnswerNumber = 1;
        for (String possibleAnswer : getPossibleAnswers()) {
            if (correctAnswers.contains(possibleAnswer)) {
                correctChoice.add(possibleAnswerNumber);
            }
            System.out.println(possibleAnswerNumber++ + ") " + possibleAnswer);
        }
    }

    public List<Integer> getUserAnswers(Scanner in) {
        List<Integer> userAnswers = new ArrayList<>();
        int attemptedAnswer = in.nextInt();
        userAnswers.add(attemptedAnswer);
        while (attemptedAnswer != 0) {
            attemptedAnswer = in.nextInt();
            userAnswers.add(attemptedAnswer);
        }
        userAnswers.remove(userAnswers.size() - 1);
        in.nextLine();
        return userAnswers;
    }

    public boolean checkAnswer(List<Integer> actualAnswer) {
        return actualAnswer.equals(correctChoice);
    }
}
