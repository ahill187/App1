package model;

public class QuizMatch {

    private String votingSystem;
    private int score;

    public QuizMatch(String votingSystem, int score) {
        this.votingSystem = votingSystem;
        this.score = score;
    }

    public String getVotingSystem() {
        return votingSystem;
    }

    public void setVotingSystem(String votingSystem) {
        this.votingSystem = votingSystem;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuizMatch)) return false;

        QuizMatch quizMatch = (QuizMatch) o;

        return score == quizMatch.score;
    }

    @Override
    public int hashCode() {
        return score;
    }
}
