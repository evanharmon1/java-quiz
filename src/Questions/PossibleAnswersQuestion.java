package Questions;

import javax.crypto.AEADBadTagException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class PossibleAnswersQuestion extends Question {

    private List<String> possibleAnswers = new ArrayList<>();

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

    public void askQuestion() {
        super.displayQuestion();
    }

}
