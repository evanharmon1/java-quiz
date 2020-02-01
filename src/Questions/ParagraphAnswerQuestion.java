package Questions;

public class ParagraphAnswerQuestion extends TextualAnswerQuestion {

    @Override
    public void askQuestion() {
        displayQuestion();
    }

    @Override
    public boolean isValid(String userAnswer) {
        return false;
    }
}
