package Questions;

import java.util.Scanner;

public class MultipleChoiceQuesiton extends PossibleAnswersQuestion {
    public <T> T getUserAnswer(Scanner in) {
        Integer userAnswer = in.nextInt();
        in.nextLine();
        return (T) userAnswer;
    }

    public <T> boolean checkAnswer(T userAnswer) {
        return ((Integer) userAnswer).equals(getCorrectChoice());
    }
}
