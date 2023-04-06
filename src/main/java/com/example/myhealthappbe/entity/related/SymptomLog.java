package com.example.myhealthappbe.entity.related;

public class SymptomLog {

    private BodyPart bodyPart;
    private Symptom symptom;
    private Questionare questionare;

    public BodyPart getBodyPart() {
        return bodyPart;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public Questionare getQuestionare() {
        return questionare;
    }

    public SymptomLog(BodyPart bodyPart, Symptom symptom, Questionare questionare) {
        this.bodyPart = bodyPart;
        this.symptom = symptom;
        this.questionare = questionare;
    }
}
