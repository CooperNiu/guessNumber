package com.twschool.practice;

public class Answer {
    private String[] answer;
    private int length;

    public String[] getAnswer() {
        return answer;
    }

    public void setAnswer(String[] answer) {
        this.answer = answer;
    }

    public Answer(String[] answer) {
        setAnswer(answer);
        setLength(answer.length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
