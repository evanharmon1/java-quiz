package Questions;

import java.util.Collections;
import java.util.List;

public class MultipleChoiceQuesiton extends PossibleAnswersQuestion {

    private String correctAnswer = new String();
    private int correctChoice;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.addPossibleAnswer(correctAnswer);
    }

    public void askQuestion() {
        super.askQuestion();
        System.out.println("Type the number next to the correct answer");
        int possibleAnswerNumber = 1;
        for (String possibleAnswer : super.getPossibleAnswers()) {
            if (possibleAnswer.equals(correctAnswer)) {
                correctChoice = possibleAnswerNumber;
            }
            System.out.println(possibleAnswerNumber++ + ") " + possibleAnswer);
        }
    }

    public boolean checkAnswer(int actualAnswer) {
        return actualAnswer == correctChoice;
    }
}
