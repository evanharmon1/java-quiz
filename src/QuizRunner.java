import Questions.Question;
import Questions.TrueFalseQuestion;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        TrueFalseQuestion isJavaGood = new TrueFalseQuestion();
        isJavaGood.setQuestion("Is Java good?");


        System.out.println("My Quiz");



    }
}
