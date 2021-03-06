package Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckBoxQuestion extends PossibleAnswersQuestion {

    private List<String> correctAnswers = new ArrayList<>();
    private List<Integer> correctChoice = new ArrayList<>();

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
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

    public <T> T getUserAnswer(Scanner in) {
        List<Integer> userAnswers = new ArrayList<>();
        Integer attemptedAnswer = in.nextInt();
        userAnswers.add(attemptedAnswer);
        while (attemptedAnswer != 0) {
            attemptedAnswer = in.nextInt();
            userAnswers.add(attemptedAnswer);
        }
        userAnswers.remove(userAnswers.size() - 1);
        in.nextLine();
        return (T) userAnswers;
    }

    public <T> boolean checkAnswer(T userAnswer) {
        return userAnswer.equals(correctChoice);
    }
}
