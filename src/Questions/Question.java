package Questions;

public abstract class Question {
    private String question;
    private String correctAnswer;
    private String attemptedAnswer;
    boolean wasAnsweredCorrectly;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getAttemptedAnswer() {
        return attemptedAnswer;
    }

    public void setAttemptedAnswer(String attemptedAnswer) {
        this.attemptedAnswer = attemptedAnswer;
    }

    public boolean isWasAnsweredCorrectly() {
        return wasAnsweredCorrectly;
    }

    public void setWasAnsweredCorrectly(boolean wasAnsweredCorrectly) {
        this.wasAnsweredCorrectly = wasAnsweredCorrectly;
    }

    public void displayQuestion() {
        System.out.println(getQuestion());
    }
}
