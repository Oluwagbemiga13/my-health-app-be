package com.example.myhealthappbe.entity.related;

import java.util.List;

public class Questionare {

    private boolean severe;
    private Message message;
    private double score;
    private List<Answer> answers;

    public boolean isSevere() {
        return severe;
    }

    public Message getMessage() {
        return message;
    }

    public double getScore() {
        return score;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setSevere(boolean severe) {
        this.severe = severe;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void addAnswer(Answer answer){
        answers.add(answer);
    }
}
