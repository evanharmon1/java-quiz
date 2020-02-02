import Questions.*;

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

        // Checkbox Question
        CheckBoxQuestion pythonFrameworks = new CheckBoxQuestion();
        pythonFrameworks.setQuestion("Which are Python frameworks?");
        pythonFrameworks.addCorrectAnswer("Flask");
        pythonFrameworks.addCorrectAnswer("Django");
        pythonFrameworks.addPossibleAnswer("Angular");
        pythonFrameworks.addPossibleAnswer("React");
        quiz.addQuestion(pythonFrameworks);

        // Short Answer Question
        ShortAnswerQuestion abstractMethod = new ShortAnswerQuestion();
        abstractMethod.setQuestion("What is an abstract method?");
        abstractMethod.setCorrectAnswer("A class that can't be instantiated");
        quiz.addQuestion(abstractMethod);

        // Paragraph Answer Question
        ParagraphAnswerQuestion pillars = new ParagraphAnswerQuestion();
        pillars.setQuestion("What are the 4 pillars of object-oriented programming?");
        pillars.setCorrectAnswer("Abstraction, encapsulation, inheritance, and polymorophism. They are wondrous.");
        quiz.addQuestion(pillars);

        // Linear Scale Question
        LinearScaleQuestion letterGrades = new LinearScaleQuestion();
        letterGrades.setQuestion("Give a score for a 'B' letter grade. E.g., for an F, you could enter any integer between 0 and 59.");
        letterGrades.setCorrectAnswerLowerBound(80);
        letterGrades.setCorrectAnswerUpperBound(89);
        quiz.addQuestion(letterGrades);
        quiz.runQuiz();

        System.out.println("You got a " + quiz.getGrade() + "%");

    }
}
