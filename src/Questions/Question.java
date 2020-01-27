package Questions;

public abstract class Question {
    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void displayQuestion() {
        System.out.println(getQuestion());
    }

    public abstract void askQuestion();
}
