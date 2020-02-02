package Questions;

public class ParagraphAnswerQuestion extends TextualAnswerQuestion {

    @Override
    public boolean isValid(String userAnswer) {
        return userAnswer.length() <= 500;
    }

    @Override
    public void printInvalidAnswerMessage() {
        System.out.println("Answer too long. Please enter an answer 500 characters or less.");
    }
}
