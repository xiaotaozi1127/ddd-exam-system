package exam.QuizBlankContext.domaim.model;

import exam.shared.Entity;

public class BlankQuiz implements Entity<BlankQuiz> {
    private final BlankQuizId blankQuizId;
    private String content;
    private int score;

    private BlankQuiz(BlankQuizId blankQuizId, String content, int score) {
        this.blankQuizId = blankQuizId;
        this.content = content;
        this.score = score;
    }

    public BlankQuizId getBlankQuizId() {
        return blankQuizId;
    }

    public String getContent() {
        return content;
    }

    public int getScore() {
        return score;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static BlankQuiz create(BlankQuizId blankQuizId, String content, int score) {
        return new BlankQuiz(blankQuizId, content, score);
    }

    @Override
    public boolean sameIdentityAs(BlankQuiz other) {
        return this.blankQuizId.equals(other.blankQuizId);
    }
}
