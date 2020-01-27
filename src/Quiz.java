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
        double grade = ((double)numberCorrect / questions.size()) * 100;
        return grade;
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
                boolean attemptedAnswer = in.nextBoolean();
                in.nextLine();
                if (((BinaryQuestion) question).checkAnswer(attemptedAnswer)) {
                    recordCorrectAnswer();
                }
            }
            else if (question instanceof MultipleChoiceQuesiton) {
                int attemptedAnswer = in.nextInt();
                in.nextLine();
                if (((MultipleChoiceQuesiton) question).checkAnswer(attemptedAnswer)) {
                    recordCorrectAnswer();
                }
            }
            else if (question instanceof CheckBoxQuestion) {
                List<Integer> attemptedAnswers = new ArrayList<>();
                int attemptedAnswer = in.nextInt();
                attemptedAnswers.add(attemptedAnswer);
                while (attemptedAnswer != 0) {
                    attemptedAnswer = in.nextInt();
                    attemptedAnswers.add(attemptedAnswer);
                }
                attemptedAnswers.remove(attemptedAnswers.size() - 1);
                if (((CheckBoxQuestion) question).checkAnswer(attemptedAnswers)) {
                    recordCorrectAnswer();
                }
            }

        }

        in.close();
        grade = calculateGrade();
    }

}
