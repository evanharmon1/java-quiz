import Questions.MultipleChoiceQuesiton;
import Questions.Question;
import Questions.TrueFalseQuestion;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.setTitle("Java Quiz");

        // True/False Questions
        TrueFalseQuestion isJavaGood = new TrueFalseQuestion();
        isJavaGood.setQuestion("Is Java good?");
        isJavaGood.setCorrectAnswer(true);
        quiz.addQuestion(isJavaGood);

        TrueFalseQuestion isVisualBasicGood = new TrueFalseQuestion();
        isVisualBasicGood.setQuestion("Is Visual Basic good?");
        isVisualBasicGood.setCorrectAnswer(false);
        quiz.addQuestion(isVisualBasicGood);

        // Multiple Choice Questions
        MultipleChoiceQuesiton whichCompiledLanguage = new MultipleChoiceQuesiton();
        whichCompiledLanguage.setQuestion("Which one of these is a compiled language?");
        whichCompiledLanguage.setCorrectAnswer("Java");
        whichCompiledLanguage.addPossibleAnswer("Python");
        whichCompiledLanguage.addPossibleAnswer("JavaScript");
        whichCompiledLanguage.addPossibleAnswer("Bash");
        quiz.addQuestion(whichCompiledLanguage);

        MultipleChoiceQuesiton whichQB = new MultipleChoiceQuesiton();
        whichQB.setQuestion("Which one of these is the best quarterback?");
        whichQB.setCorrectAnswer("Patrick Mahomes");
        whichQB.addPossibleAnswer("Blake Bortles");
        whichQB.addPossibleAnswer("Jimmy Garoppolo");
        quiz.addQuestion(whichQB);

        quiz.runQuiz();

        System.out.println("You got a " + quiz.getGrade() + "%");

    }
}
