import Questions.Question;

import java.util.List;

public class Quiz {
    List<Question> questions;
    int numberOfQuestions;
    int numberCorrect;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void recordCorrectAnswer() {
        numberCorrect++;
    }

    public void runQuiz() {
        numberOfQuestions = questions.size();
    }


}
