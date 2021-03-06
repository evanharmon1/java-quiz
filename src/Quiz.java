import Questions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private String title;
    List<Question> questions = new ArrayList<>();
    private int numberCorrect;
    private double grade;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double calculateGrade() {
        return ((double)numberCorrect / questions.size()) * 100;
    }

    public void recordCorrectAnswer() {
        numberCorrect++;
    }

    public void runQuiz() {
        System.out.println(title);

        Scanner in = new Scanner(System.in);

        for (Question question : questions) {
            question.askQuestion();

            if (question instanceof BinaryQuestion) {
                BinaryQuestion binaryQuestion = (BinaryQuestion) question;
                if (binaryQuestion.checkAnswer(binaryQuestion.getUserAnswer(in))) {
                    recordCorrectAnswer();
                }
            }
            else if (question instanceof PossibleAnswersQuestion) {
                PossibleAnswersQuestion possibleAnswersQuestion = (PossibleAnswersQuestion) question;
                if (possibleAnswersQuestion.checkAnswer(possibleAnswersQuestion.getUserAnswer(in))) {
                    recordCorrectAnswer();
                }
            }
            else if (question instanceof TextualAnswerQuestion) {
                TextualAnswerQuestion textualAnswerQuestion = (TextualAnswerQuestion) question;
                String userAnswer = textualAnswerQuestion.getUserAnswer(in);
                while (!textualAnswerQuestion.isValid(userAnswer)) {
                    textualAnswerQuestion.printInvalidAnswerMessage();
                    userAnswer = textualAnswerQuestion.getUserAnswer(in);
                }
                if (textualAnswerQuestion.checkAnswer(userAnswer)) {
                    recordCorrectAnswer();
                }
            }
            else if (question instanceof LinearScaleQuestion) {
                LinearScaleQuestion linearScaleQuestion = (LinearScaleQuestion) question;
                if (linearScaleQuestion.checkAnswer(linearScaleQuestion.getUserAnswer(in))) {
                    recordCorrectAnswer();
                }
            }
        }

        in.close();
        grade = calculateGrade();
    }

}
